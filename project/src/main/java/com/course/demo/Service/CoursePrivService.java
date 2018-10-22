package com.course.demo.Service;

import com.course.demo.DTO.CoursePrivDTO;
import com.course.demo.Dao.CoursePrivDao;
import com.course.demo.Entity.CoursePrivateEntity;
import com.course.demo.Entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//处理所有私教课信息，需要引入一个CoursePrivDTO
//TeacherIds字段存储一个老师
@Service
public class CoursePrivService {
    @Autowired
    CoursePrivDao coursePrivDao;

    @Autowired
    TeacherService teacherService;

    //查找所有私教课
    public List<CoursePrivDTO> listAllCoursePriv(){
        List<CoursePrivateEntity> coursePrivateEntities=coursePrivDao.findAll();
        List<CoursePrivDTO> coursePrivDTOS=new ArrayList<>();

        for(CoursePrivateEntity coursePrivateEntity:coursePrivateEntities){
            //获取教师信息
            TeacherEntity teacherEntity = teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
            //new一个DTO信息
            CoursePrivDTO coursePrivDTO=new CoursePrivDTO();
            coursePrivDTO.setName(coursePrivateEntity.getName());
            coursePrivDTO.setPrice(coursePrivateEntity.getPrice());
            coursePrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());
            coursePrivDTO.setTeacherName(teacherEntity.getName());
            coursePrivDTO.setIntro(teacherEntity.getIntro());
            coursePrivDTO.setPhone(teacherEntity.getPhone());
            coursePrivDTO.setTeacherUrl(teacherEntity.getTeacherUrl());
            //将DTO放入容器
            coursePrivDTOS.add(coursePrivDTO);
        }

        return coursePrivDTOS;
    }

    //通过id查找私教课
    public CoursePrivDTO getCoursePrivById(int id){
        CoursePrivateEntity coursePrivateEntity=coursePrivDao.findById(id);

        //如果不存在该条记录返回一个空对象
        if(coursePrivateEntity==null)
            return new CoursePrivDTO();

        //获取教师信息
        TeacherEntity teacherEntity = teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
        //new一个DTO信息
        CoursePrivDTO coursePrivDTO=new CoursePrivDTO();
        coursePrivDTO.setName(coursePrivateEntity.getName());
        coursePrivDTO.setPrice(coursePrivateEntity.getPrice());
        coursePrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());
        coursePrivDTO.setTeacherName(teacherEntity.getName());
        coursePrivDTO.setIntro(teacherEntity.getIntro());
        coursePrivDTO.setPhone(teacherEntity.getPhone());
        coursePrivDTO.setTeacherUrl(teacherEntity.getTeacherUrl());

        return coursePrivDTO;
    }

    //通过name查找私教课
    public CoursePrivDTO getCoursePrivByName(String name){
        CoursePrivateEntity coursePrivateEntity=coursePrivDao.findByName(name);

        //如果不存在该条记录返回一个空对象
        if(coursePrivateEntity==null)
            return new CoursePrivDTO();

        //获取教师信息
        TeacherEntity teacherEntity = teacherService.getTeacherById(coursePrivateEntity.getTeacherId());
        //new一个DTO信息
        CoursePrivDTO coursePrivDTO=new CoursePrivDTO();
        coursePrivDTO.setName(coursePrivateEntity.getName());
        coursePrivDTO.setPrice(coursePrivateEntity.getPrice());
        coursePrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());
        coursePrivDTO.setTeacherName(teacherEntity.getName());
        coursePrivDTO.setIntro(teacherEntity.getIntro());
        coursePrivDTO.setPhone(teacherEntity.getPhone());
        coursePrivDTO.setTeacherUrl(teacherEntity.getTeacherUrl());

        return coursePrivDTO;
    }

    //通过teacherId查找私教课
    public List<CoursePrivDTO> listCoursePrivByTeacherId(int teacherId){
        List<CoursePrivateEntity> coursePrivateEntities=coursePrivDao.findByTeacherId(teacherId);
        List<CoursePrivDTO> coursePrivDTOS=new ArrayList<>();

        for(CoursePrivateEntity coursePrivateEntity:coursePrivateEntities){
            //获取教师信息
            TeacherEntity teacherEntity = teacherService.getTeacherById(teacherId);
            //new一个DTO信息
            CoursePrivDTO coursePrivDTO=new CoursePrivDTO();
            coursePrivDTO.setName(coursePrivateEntity.getName());
            coursePrivDTO.setPrice(coursePrivateEntity.getPrice());
            coursePrivDTO.setTeacherId(coursePrivateEntity.getTeacherId());
            coursePrivDTO.setTeacherName(teacherEntity.getName());
            coursePrivDTO.setIntro(teacherEntity.getIntro());
            coursePrivDTO.setPhone(teacherEntity.getPhone());
            coursePrivDTO.setTeacherUrl(teacherEntity.getTeacherUrl());
            //将DTO放入容器
            coursePrivDTOS.add(coursePrivDTO);
        }

        return coursePrivDTOS;
    }

    //新增一节私教课
    //未实现！！！
    public boolean addCoursePriv(CoursePrivateEntity coursePrivateEntity){
        //判断老师是否存在，不存在就返回false
        if(teacherService.getTeacherById(coursePrivateEntity.getTeacherId())==null)
            return false;

        //判断老价格是否为空，不存在就返回false
        if(coursePrivateEntity.getPrice()==null)
            return false;

        try{
            coursePrivDao.save(coursePrivateEntity);
        }
        catch (Exception e){
            System.out.println("新增一节私教课出错："+e.getCause()+" "+e.getMessage());
            return false;
        }

        return true;
    }

    //修改一节私教课信息
    //未实现！！！
    public boolean updateCoursePriv(CoursePrivateEntity coursePrivateEntity){
        try{

        }catch (Exception e){
            System.out.println("修改私教课信息："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }

    //删除一节私教课
    public boolean removeCoursePriv(int id){
        try{
            coursePrivDao.deleteById(id);
        }
        catch (Exception e){
            System.out.println("删除一节私教课失败："+e.getCause()+" "+e.getMessage());
            return false;
        }

        return true;
    }
}
