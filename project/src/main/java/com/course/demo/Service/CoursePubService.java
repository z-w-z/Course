package com.course.demo.Service;

import com.course.demo.DTO.CoursePubDTO;
import com.course.demo.Dao.CoursePubDao;
import com.course.demo.Entity.CoursePublicEntity;
import com.course.demo.Entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//处理所有公共课信息
@Service
public class CoursePubService {
    @Autowired
    CoursePubDao coursePubDao;

    @Autowired
    TeacherService teacherService;

    //获取所有公共课信息
    public List<CoursePubDTO> listAllCoursePublic(){
        List<CoursePublicEntity> coursePublicEntities=coursePubDao.findAll();
        List<CoursePubDTO> coursePubDTOS=new ArrayList<>();

        for(CoursePublicEntity coursePublicEntity:coursePublicEntities){
            //获取教师信息
            TeacherEntity teacherEntity = teacherService.getTeacherById(coursePublicEntity.getTeacherId());
            //new一个DTO信息
            CoursePubDTO coursePubDTO=new CoursePubDTO();
            coursePubDTO.setName(coursePublicEntity.getName());
            coursePubDTO.setType(coursePublicEntity.getType());
            coursePubDTO.setMaxPerson(coursePublicEntity.getMaxPerson());
            coursePubDTO.setPrice(coursePublicEntity.getPrice());
            coursePubDTO.setDateRange(coursePublicEntity.getDateRange());
            coursePubDTO.setAddr(coursePublicEntity.getAddr());
            coursePubDTO.setIntro(coursePublicEntity.getIntro());
            coursePubDTO.setTeacherId(coursePublicEntity.getTeacherId());

            coursePubDTO.setTeacherName(teacherEntity.getName());
            coursePubDTO.setTeacherIntro(teacherEntity.getIntro());
            coursePubDTO.setPhone(teacherEntity.getPhone());
            coursePubDTO.setTeacherUrl(teacherEntity.getTeacherUrl());
            //将DTO放入容器
            coursePubDTOS.add(coursePubDTO);
        }

        return coursePubDTOS;
    }

    //通过id获取公共课信息
    public CoursePubDTO getCoursePublicById(int id){
        CoursePublicEntity coursePublicEntity=coursePubDao.findById(id);

        //如果不存在该条记录返回一个空类
        if(coursePublicEntity==null)
            return new CoursePubDTO();

        //获取教师信息
        TeacherEntity teacherEntity = teacherService.getTeacherById(coursePublicEntity.getTeacherId());
        //new一个DTO信息
        CoursePubDTO coursePubDTO=new CoursePubDTO();
        coursePubDTO.setName(coursePublicEntity.getName());
        coursePubDTO.setType(coursePublicEntity.getType());
        coursePubDTO.setMaxPerson(coursePublicEntity.getMaxPerson());
        coursePubDTO.setPrice(coursePublicEntity.getPrice());
        coursePubDTO.setDateRange(coursePublicEntity.getDateRange());
        coursePubDTO.setAddr(coursePublicEntity.getAddr());
        coursePubDTO.setIntro(coursePublicEntity.getIntro());
        coursePubDTO.setTeacherId(coursePublicEntity.getTeacherId());

        coursePubDTO.setTeacherName(teacherEntity.getName());
        coursePubDTO.setTeacherIntro(teacherEntity.getIntro());
        coursePubDTO.setPhone(teacherEntity.getPhone());
        coursePubDTO.setTeacherUrl(teacherEntity.getTeacherUrl());

        return coursePubDTO;
    }

    //通过name获取公共课信息
    public CoursePubDTO getCoursePublicByName(String name){
        CoursePublicEntity coursePublicEntity=coursePubDao.findByName(name);

        //如果不存在该条记录返回一个空类
        if(coursePublicEntity==null)
            return new CoursePubDTO();

        //获取教师信息
        TeacherEntity teacherEntity = teacherService.getTeacherById(coursePublicEntity.getTeacherId());
        //new一个DTO信息
        CoursePubDTO coursePubDTO=new CoursePubDTO();
        coursePubDTO.setName(coursePublicEntity.getName());
        coursePubDTO.setType(coursePublicEntity.getType());
        coursePubDTO.setMaxPerson(coursePublicEntity.getMaxPerson());
        coursePubDTO.setPrice(coursePublicEntity.getPrice());
        coursePubDTO.setDateRange(coursePublicEntity.getDateRange());
        coursePubDTO.setAddr(coursePublicEntity.getAddr());
        coursePubDTO.setIntro(coursePublicEntity.getIntro());
        coursePubDTO.setTeacherId(coursePublicEntity.getTeacherId());

        coursePubDTO.setTeacherName(teacherEntity.getName());
        coursePubDTO.setTeacherIntro(teacherEntity.getIntro());
        coursePubDTO.setPhone(teacherEntity.getPhone());
        coursePubDTO.setTeacherUrl(teacherEntity.getTeacherUrl());

        return coursePubDTO;
    }

    //通过teacherId获取对应公共课信息
    public List<CoursePubDTO> listCoursePublicByTeacherId(int teacherId){
        List<CoursePublicEntity> coursePublicEntities=coursePubDao.findByTeacherId(teacherId);
        List<CoursePubDTO> coursePubDTOS=new ArrayList<>();

        for(CoursePublicEntity coursePublicEntity:coursePublicEntities){
            //获取教师信息
            TeacherEntity teacherEntity = teacherService.getTeacherById(teacherId);
            //new一个DTO信息
            CoursePubDTO coursePubDTO=new CoursePubDTO();
            coursePubDTO.setName(coursePublicEntity.getName());
            coursePubDTO.setType(coursePublicEntity.getType());
            coursePubDTO.setMaxPerson(coursePublicEntity.getMaxPerson());
            coursePubDTO.setPrice(coursePublicEntity.getPrice());
            coursePubDTO.setDateRange(coursePublicEntity.getDateRange());
            coursePubDTO.setAddr(coursePublicEntity.getAddr());
            coursePubDTO.setIntro(coursePublicEntity.getIntro());
            coursePubDTO.setTeacherId(coursePublicEntity.getTeacherId());

            coursePubDTO.setTeacherName(teacherEntity.getName());
            coursePubDTO.setTeacherIntro(teacherEntity.getIntro());
            coursePubDTO.setPhone(teacherEntity.getPhone());
            coursePubDTO.setTeacherUrl(teacherEntity.getTeacherUrl());
            //将DTO放入容器
            coursePubDTOS.add(coursePubDTO);
        }

        return coursePubDTOS;
    }

    //新增一个公共课

    //修改一个公共课

    //删除一个公共课
    public boolean removeCoursePublic(int id){
        try{
            coursePubDao.deleteById(id);
        }
        catch (Exception e){
            System.out.println("删除一个公共课出错"+e.getCause()+" "+e.getMessage());
            return false;
        }

        return true;
    }
}
