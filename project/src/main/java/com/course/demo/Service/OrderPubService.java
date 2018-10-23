package com.course.demo.Service;

import com.course.demo.DTO.OrderPubDTO;
import com.course.demo.Dao.CoursePubDao;
import com.course.demo.Dao.OrderPubDao;
import com.course.demo.Entity.CoursePublicEntity;
import com.course.demo.Entity.OrderPrivateEntity;
import com.course.demo.Entity.OrderPublicEntity;
import com.course.demo.Util.DataHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
@Service
public class OrderPubService {
    @Autowired
    OrderPubDao orderPubDao;

    @Autowired
    CoursePubDao coursePubDao;

    //通过id查找
    public OrderPubDTO getById(int id) {
        OrderPublicEntity orderPublicEntity = orderPubDao.findById(id);

        CoursePublicEntity coursePublicEntity = coursePubDao.findById(orderPublicEntity.getCoursePubId());

        //如果不存在该课程，跳过
        if (coursePublicEntity == null)
            return new OrderPubDTO();

        //新建一个DTO
        OrderPubDTO orderPubDTO = new OrderPubDTO();
        orderPubDTO.setCoursePubId(id);
        orderPubDTO.setUserId(orderPublicEntity.getUserId());
        orderPubDTO.setPayMoney(orderPublicEntity.getPayMoney());
        orderPubDTO.setStatus(orderPubDTO.getStatus());
        orderPubDTO.setPeopleNumber(orderPublicEntity.getPeopleNumber());

        orderPubDTO.setCoursePubName(coursePublicEntity.getName());
        orderPubDTO.setCoursePubPrice(coursePublicEntity.getPrice());
        orderPubDTO.setCoursePubDateRange(coursePublicEntity.getDateRange());
        orderPubDTO.setCoursePubAddr(coursePublicEntity.getAddr());
        orderPubDTO.setCoursePubWhatDay(coursePublicEntity.getWhatDay());
        orderPubDTO.setCoursePubWeekDay(DataHandleUtil.DateToWeek(coursePublicEntity.getWhatDay()));

        return orderPubDTO;
    }

    //根据用户id查找
    public List<OrderPubDTO> getByUserId(int userId) {
        List<OrderPublicEntity> orderPublicEntities=orderPubDao.findByUserId(userId);
        List<OrderPubDTO> orderPubDTOS=new ArrayList<>();

        for(OrderPublicEntity orderPublicEntity:orderPublicEntities){
            //获取课程信息
            CoursePublicEntity coursePublicEntity=coursePubDao.findById(orderPublicEntity.getCoursePubId());

            //如果不存在该课程，跳过
            if(coursePublicEntity==null)
                continue;

            //新建一个DTO
            OrderPubDTO orderPubDTO=new OrderPubDTO();
            orderPubDTO.setCoursePubId(orderPublicEntity.getCoursePubId());
            orderPubDTO.setUserId(userId);
            orderPubDTO.setPayMoney(orderPublicEntity.getPayMoney());
            orderPubDTO.setStatus(orderPubDTO.getStatus());
            orderPubDTO.setPeopleNumber(orderPublicEntity.getPeopleNumber());

            orderPubDTO.setCoursePubName(coursePublicEntity.getName());
            orderPubDTO.setCoursePubPrice(coursePublicEntity.getPrice());
            orderPubDTO.setCoursePubDateRange(coursePublicEntity.getDateRange());
            orderPubDTO.setCoursePubAddr(coursePublicEntity.getAddr());
            orderPubDTO.setCoursePubWhatDay(coursePublicEntity.getWhatDay());
            orderPubDTO.setCoursePubWeekDay(DataHandleUtil.DateToWeek(coursePublicEntity.getWhatDay()));

            //存入List
            orderPubDTOS.add(orderPubDTO);
        }

        return orderPubDTOS;
    }

    //通过用户id和课程id查找
    public List<OrderPubDTO> getByUserIdAndCourseId(int userId, int coursePubId) {
        List<OrderPublicEntity> orderPublicEntities=orderPubDao.findByUserIdAndCoursePubId(userId, coursePubId);
        List<OrderPubDTO> orderPubDTOS=new ArrayList<>();

        for(OrderPublicEntity orderPublicEntity:orderPublicEntities){
            //获取课程信息
            CoursePublicEntity coursePublicEntity=coursePubDao.findById(orderPublicEntity.getCoursePubId());

            //如果不存在该课程，跳过
            if(coursePublicEntity==null)
                continue;

            //新建一个DTO
            OrderPubDTO orderPubDTO=new OrderPubDTO();
            orderPubDTO.setCoursePubId(coursePubId);
            orderPubDTO.setUserId(userId);
            orderPubDTO.setPayMoney(orderPublicEntity.getPayMoney());
            orderPubDTO.setStatus(orderPubDTO.getStatus());
            orderPubDTO.setPeopleNumber(orderPublicEntity.getPeopleNumber());

            orderPubDTO.setCoursePubName(coursePublicEntity.getName());
            orderPubDTO.setCoursePubPrice(coursePublicEntity.getPrice());
            orderPubDTO.setCoursePubDateRange(coursePublicEntity.getDateRange());
            orderPubDTO.setCoursePubAddr(coursePublicEntity.getAddr());
            orderPubDTO.setCoursePubWhatDay(coursePublicEntity.getWhatDay());
            orderPubDTO.setCoursePubWeekDay(DataHandleUtil.DateToWeek(coursePublicEntity.getWhatDay()));

            //存入List
            orderPubDTOS.add(orderPubDTO);
        }

        return orderPubDTOS;
    }

    //返回所有信息
    public List<OrderPubDTO> getAll() {
        List<OrderPublicEntity> orderPublicEntities=orderPubDao.findAll();
        List<OrderPubDTO> orderPubDTOS=new ArrayList<>();

        for(OrderPublicEntity orderPublicEntity:orderPublicEntities){
            //获取课程信息
            CoursePublicEntity coursePublicEntity=coursePubDao.findById(orderPublicEntity.getCoursePubId());

            //如果不存在该课程，跳过
            if(coursePublicEntity==null)
                continue;

            //新建一个DTO
            OrderPubDTO orderPubDTO=new OrderPubDTO();
            orderPubDTO.setCoursePubId(orderPublicEntity.getCoursePubId());
            orderPubDTO.setUserId(orderPublicEntity.getUserId());
            orderPubDTO.setPayMoney(orderPublicEntity.getPayMoney());
            orderPubDTO.setStatus(orderPubDTO.getStatus());
            orderPubDTO.setPeopleNumber(orderPublicEntity.getPeopleNumber());

            orderPubDTO.setCoursePubName(coursePublicEntity.getName());
            orderPubDTO.setCoursePubPrice(coursePublicEntity.getPrice());
            orderPubDTO.setCoursePubDateRange(coursePublicEntity.getDateRange());
            orderPubDTO.setCoursePubAddr(coursePublicEntity.getAddr());
            orderPubDTO.setCoursePubWhatDay(coursePublicEntity.getWhatDay());
            orderPubDTO.setCoursePubWeekDay(DataHandleUtil.DateToWeek(coursePublicEntity.getWhatDay()));

            //存入List
            orderPubDTOS.add(orderPubDTO);
        }

        return orderPubDTOS;
    }

    //根据上课情况查找
    public List<OrderPubDTO> getByStatus(int status) {
        List<OrderPublicEntity> orderPublicEntities=orderPubDao.findByStatus(status);
        List<OrderPubDTO> orderPubDTOS=new ArrayList<>();

        for(OrderPublicEntity orderPublicEntity:orderPublicEntities){
            //获取课程信息
            CoursePublicEntity coursePublicEntity=coursePubDao.findById(orderPublicEntity.getCoursePubId());

            //如果不存在该课程，跳过
            if(coursePublicEntity==null)
                continue;

            //新建一个DTO
            OrderPubDTO orderPubDTO=new OrderPubDTO();
            orderPubDTO.setCoursePubId(orderPublicEntity.getCoursePubId());
            orderPubDTO.setUserId(orderPublicEntity.getUserId());
            orderPubDTO.setPayMoney(orderPublicEntity.getPayMoney());
            orderPubDTO.setStatus(status);
            orderPubDTO.setPeopleNumber(orderPublicEntity.getPeopleNumber());

            orderPubDTO.setCoursePubName(coursePublicEntity.getName());
            orderPubDTO.setCoursePubPrice(coursePublicEntity.getPrice());
            orderPubDTO.setCoursePubDateRange(coursePublicEntity.getDateRange());
            orderPubDTO.setCoursePubAddr(coursePublicEntity.getAddr());
            orderPubDTO.setCoursePubWhatDay(coursePublicEntity.getWhatDay());
            orderPubDTO.setCoursePubWeekDay(DataHandleUtil.DateToWeek(coursePublicEntity.getWhatDay()));

            //存入List
            orderPubDTOS.add(orderPubDTO);
        }

        return orderPubDTOS;
    }

    //根据课程Id和用户id删除一节公共课记录
    public boolean removeOrderPub(int userId,int coursePubId) {
        try {
            orderPubDao.deleteByUserIdAndCoursePubId(userId,coursePubId);
        } catch (Exception e) {
            System.out.println("删除记录出错:"+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }

    //新增一条公共课订单
    public boolean addOrderPub(OrderPublicEntity orderPublicEntity) {
        //人数不能为空
        if(orderPublicEntity.getPeopleNumber()==null)
            return false;
        try {
            orderPubDao.save(orderPublicEntity);
        }
        catch (Exception e){
            System.out.println("添加课程出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }

    //修改当前公共课订单状态
    //系统定时器
    //未实现
    public boolean updateStatus(int userId,int coursePubId) {

        return true;
    }
}
