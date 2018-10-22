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
        //如果老师已存在，则添加失败
        if(teacherDao.findById(teacherEntity.getId())!=null){
            System.out.println("添加老师出错，该老师已存在");
            return false;
        }
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
    //3.删除老师
    public boolean removeTeacher(int id){
        if(teacherDao.findById(id)==null){
            System.out.println("删除错误，该老师不存在");
            return false;
        }
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
    //修改老师姓名,找到id对应的老师，按name更新
    public boolean updateTeacherNameById(int id,String name){
        //看老师是否存在，不存在报错
        if(teacherDao.findById(id)==null){
            System.out.println("修改错误，该老师不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try{
            TeacherEntity teacherEntity=teacherDao.findById(id);
            teacherEntity.setName(name);
            teacherDao.save(teacherEntity);
        }
        catch (Exception e){
            System.out.println("修改老师姓名出错："+e.getCause()+" "+e.getMessage());
            return  false;
        }
        return true;
    }
    //修改老师头像，找到id对应的老师，按teacher_url更新
    public boolean updateTeacherUrlById(int id,String teacher_url){
        if(teacherDao.findById(id)==null){
            System.out.println("修改错误，该老师不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            TeacherEntity teacherEntity=teacherDao.findById(id);
            teacherEntity.setTeacherUrl(teacher_url);
            teacherDao.save(teacherEntity);
        }
        catch (Exception e){
            System.out.println("修改老师头像错误："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //修改老师介绍，找到id对应的老师，按intro更新
    public boolean updateTeacherIntroById(int id,String intro){
        //看老师是否存在，不存在报错
        if(teacherDao.findById(id)==null){
            System.out.println("修改错误，该老师不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            TeacherEntity teacherEntity=teacherDao.findById(id);
            teacherEntity.setIntro(intro);
            teacherDao.save(teacherEntity);
        }
        catch (Exception e){
            System.out.println("修改老师介绍出错"+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //修改老师电话，找到id对应的老师，按phone更新
    public boolean updateTeacherPhoneById(int id,String phone){
        //看老师是否存在，不存在报错
        if(teacherDao.findById(id)==null){
            System.out.println("修改错误，该老师不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            TeacherEntity teacherEntity=teacherDao.findById(id);
            teacherEntity.setPhone(phone);
            teacherDao.save(teacherEntity);
        }
        catch (Exception e){
            System.out.println("修改老师电话出错"+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
}
