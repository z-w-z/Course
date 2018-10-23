package com.course.demo.Service;

import com.course.demo.DTO.OrderPrivDTO;
import com.course.demo.Dao.CoursePrivDao;
import com.course.demo.Dao.OrderPrivDao;
import com.course.demo.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrderPrivService {
    @Autowired
    OrderPrivDao orderPrivDao;

    @Autowired
    CoursePrivDao coursePrivDao;

    @Autowired
    TeacherService teacherService;

    //返回所有私教课信息
    public List<OrderPrivDTO> listAllOrderPrivate() {
        List<OrderPrivateEntity> orderPrivateEntities=orderPrivDao.findAll();
        List<OrderPrivDTO> orderPrivDTOS=new ArrayList<>();

        for (OrderPrivateEntity orderPrivateEntity:orderPrivateEntities){
            CoursePrivateEntity coursePrivateEntity=coursePrivDao.findById(orderPrivateEntity.getCoursePrivId());
            //如果不存在该私教课，跳过
            if(coursePrivateEntity==null)
                continue;
            TeacherEntity teacherEntity=teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
            //如果不存在该老师，跳过
            if(teacherEntity==null)
                continue;

            //新建DTO
            OrderPrivDTO orderPrivDTO=new OrderPrivDTO();
            orderPrivDTO.setCoursePrivId(orderPrivateEntity.getCoursePrivId());
            orderPrivDTO.setUserId(orderPrivateEntity.getUserId());
            orderPrivDTO.setTotalClass(orderPrivateEntity.getTotalClass());

            orderPrivDTO.setCoursePrivName(coursePrivateEntity.getName());
            orderPrivDTO.setCoursePrivPrice(coursePrivateEntity.getPrice());
            orderPrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());

            orderPrivDTO.setTeacherName(teacherEntity.getName());

            //存入List
            orderPrivDTOS.add(orderPrivDTO);
        }
        return orderPrivDTOS;
    }

    //根据私教课id和用户id查找私教订单
    public OrderPrivDTO getByUserIdAndCourseId(int userId,int courseId) {
        OrderPrivateEntity orderPrivateEntity = orderPrivDao.findByUserIdAndCoursePrivId(userId, courseId);
        CoursePrivateEntity coursePrivateEntity = coursePrivDao.findById(orderPrivateEntity.getCoursePrivId());
        //如果不存在该私教课，返回
        if (coursePrivateEntity == null)
            return new OrderPrivDTO();
        TeacherEntity teacherEntity = teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
        //如果不存在该老师，返回
        if (teacherEntity == null)
            return new OrderPrivDTO();

        //新建DTO
        OrderPrivDTO orderPrivDTO = new OrderPrivDTO();
        orderPrivDTO.setCoursePrivId(orderPrivateEntity.getCoursePrivId());
        orderPrivDTO.setUserId(orderPrivateEntity.getUserId());
        orderPrivDTO.setTotalClass(orderPrivateEntity.getTotalClass());

        orderPrivDTO.setCoursePrivName(coursePrivateEntity.getName());
        orderPrivDTO.setCoursePrivPrice(coursePrivateEntity.getPrice());
        orderPrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());

        orderPrivDTO.setTeacherName(teacherEntity.getName());

        return orderPrivDTO;
    }

    //根据用户id找私教订单
    public List<OrderPrivDTO> listByUserId(int userId){
        List<OrderPrivateEntity> orderPrivateEntities=orderPrivDao.findByUserId(userId);
        List<OrderPrivDTO> orderPrivDTOS=new ArrayList<>();

        for (OrderPrivateEntity orderPrivateEntity:orderPrivateEntities){
            CoursePrivateEntity coursePrivateEntity=coursePrivDao.findById(orderPrivateEntity.getCoursePrivId());
            //如果不存在该私教课，跳过
            if(coursePrivateEntity==null)
                continue;
            TeacherEntity teacherEntity=teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
            //如果不存在该老师，跳过
            if(teacherEntity==null)
                continue;

            //新建DTO
            OrderPrivDTO orderPrivDTO=new OrderPrivDTO();
            orderPrivDTO.setCoursePrivId(orderPrivateEntity.getCoursePrivId());
            orderPrivDTO.setUserId(userId);
            orderPrivDTO.setTotalClass(orderPrivateEntity.getTotalClass());

            orderPrivDTO.setCoursePrivName(coursePrivateEntity.getName());
            orderPrivDTO.setCoursePrivPrice(coursePrivateEntity.getPrice());
            orderPrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());

            orderPrivDTO.setTeacherName(teacherEntity.getName());

            //存入List
            orderPrivDTOS.add(orderPrivDTO);
        }
        return orderPrivDTOS;
    }

    //根据课程id找私教订单
    public List<OrderPrivDTO> listByCourseId(int coursePrivId) {
        List<OrderPrivateEntity> orderPrivateEntities=orderPrivDao.findByCoursePrivId(coursePrivId);
        List<OrderPrivDTO> orderPrivDTOS=new ArrayList<>();

        for (OrderPrivateEntity orderPrivateEntity:orderPrivateEntities){
            CoursePrivateEntity coursePrivateEntity=coursePrivDao.findById(orderPrivateEntity.getCoursePrivId());
            //如果不存在该私教课，跳过
            if(coursePrivateEntity==null)
                continue;
            TeacherEntity teacherEntity=teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
            //如果不存在该老师，跳过
            if(teacherEntity==null)
                continue;

            //新建DTO
            OrderPrivDTO orderPrivDTO=new OrderPrivDTO();
            orderPrivDTO.setCoursePrivId(coursePrivId);
            orderPrivDTO.setUserId(orderPrivateEntity.getUserId());
            orderPrivDTO.setTotalClass(orderPrivateEntity.getTotalClass());

            orderPrivDTO.setCoursePrivName(coursePrivateEntity.getName());
            orderPrivDTO.setCoursePrivPrice(coursePrivateEntity.getPrice());
            orderPrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());

            orderPrivDTO.setTeacherName(teacherEntity.getName());

            //存入List
            orderPrivDTOS.add(orderPrivDTO);
        }
        return orderPrivDTOS;
    }

    //新增一节私教课预约信息
    //如果没记录，增加一条记录
    //如果有记录，修改一条记录，未完成
    public boolean addOrderPriv(OrderPrivateEntity orderPrivateEntity){
        //如果传入总课时为空，取消添加
        if(orderPrivateEntity.getTotalClass()==null)
            return false;

        //如果不存在该记录，增加一条记录
        if(orderPrivDao.findByUserIdAndCoursePrivId(orderPrivateEntity.getUserId(),orderPrivateEntity.getCoursePrivId())==null){
            try
            {
                orderPrivDao.save(orderPrivateEntity);
            }
            catch (Exception e){
                System.out.println("添加课程出错："+e.getCause()+" "+e.getMessage());
                return false;
            }
        }
        else{
            //如果有记录，修改一条记录，未完成
        }

        return true;
    }

    //删除记录（根据userId和CourseId）
    public boolean removeOrderPriv(int userId,int courseId) {
        try {
            orderPrivDao.deleteByUserIdAndCoursePrivId(userId, courseId);
        } catch (Exception e) {
            System.out.println("删除记录出错:" + e.getCause() + " " + e.getMessage());
            return false;
        }
        return true;
    }

    //修改总课程数（续课）传入续课节次
    //未完成
    public boolean updateTotalclass(int userId,int courseId,int classNum) {
        return true;
    }
}
