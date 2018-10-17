package com.course.demo.Service;

import com.course.demo.DTO.CoursePrivDTO;
import com.course.demo.Dao.CoursePrivDao;
import com.course.demo.Entity.CoursePrivateEntity;
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
    //需要教师的Service，暂时不写
    public List<CoursePrivDTO> listAllCoursePriv(){
        List<CoursePrivateEntity> coursePrivateEntities=coursePrivDao.findAll();
        List<CoursePrivDTO> coursePrivDTOS=new ArrayList<>();

        for(CoursePrivateEntity coursePrivateEntity:coursePrivateEntities){
            //加入coursePrivDTOS
        }
        return coursePrivDTOS;
    }

    //通过id查找私教课
    //未实现
    //public CoursePrivDTO getCoursePrivById(int id){   }

    //新增一节私教课
    public boolean addCoursePriv(CoursePrivateEntity coursePrivateEntity){
        //判断老师是否存在

        try{
            coursePrivDao.save(coursePrivateEntity);
        }
        catch (Exception e){
            System.out.println("新增一节私教课出错："+e.getCause()+" "+e.getMessage());
            return false;
        }

        return true;
    }

    //删除一节私教课
}
