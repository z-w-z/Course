package com.course.demo.Service;

import com.course.demo.Dao.TeacherDao;
import com.course.demo.Entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;

    //添加一个老师
    public boolean addTeacher(TeacherEntity teacherEntity){

        try
        {
            teacherDao.save(teacherEntity);
        }
        catch (Exception e){
            System.out.println("添加老师出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
}
