package com.course.demo.Service;

import com.course.demo.Dao.TeacherDao;
import com.course.demo.Entity.TeacherEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;
    //1.查找老师

    //返回所有Teacher,按id升序
    public List<TeacherEntity> listAllTeachers(){
        Sort sort=new Sort(Sort.Direction.ASC,"id");
        return teacherDao.findAll(sort);
    }
    //通过id查找Teacher
    public TeacherEntity getTeacherById(int id){
        return new TeacherEntity();
    }
    //通过phone找Teacher
    public TeacherEntity getTeacherByPhone(String phone){
        return new TeacherEntity();
    }
    //通过name找Teacher
    public List<TeacherEntity> listTeachersByName(String name){
        return teacherDao.findByName(name);
    }

    //2.添加老师
    //添加一个老师
    public boolean addTeacher(TeacherEntity teacherEntity){
        try {
            teacherDao.save(teacherEntity);
        }
        catch (Exception e){
            System.out.println("添加老师出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }

    //3.删除老师
    public boolean removeTeacher(int id){
        try {
            teacherDao.deleteById(id);
        }
        catch (Exception e){
            System.out.println("删除一个老师出错："+e.getCause()+" "+e.getMessage());
            return  false;
        }
        return  true;
    }

    //4.修改老师信息
    //未完成
    public boolean updateTeacherNameById(){

        return true;
    }
}
