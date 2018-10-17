package com.course.demo.Service;

import com.course.demo.Dao.CoursePrivHistoryDao;
import com.course.demo.Entity.CoursePrivHistoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//私教课历史信息信息，一条一条载入，主键——用户id和私教课订单id
@Service
public class CoursePrivHistoryService {
    @Autowired
    CoursePrivHistoryDao coursePrivHistoryDao;

    //所有私教课
    public List<CoursePrivHistoryEntity> listAllCoursePrivHistories(){
        return coursePrivHistoryDao.findAll();
    }

    //通过userId和orderPrivId返回私教课历史信息表
    public List<CoursePrivHistoryEntity> listCoursePrivHistoriesByUserIdAndOrderPrivId(int userId,int orderPrivId){
        return coursePrivHistoryDao.findByUserIdAndOrderPrivId(userId,orderPrivId);
    }

    //通过userId和orderPrivId返回私教课最新历史信息
    public CoursePrivHistoryEntity getCoursePrivHistoryByUserIdAndOrderPrivId(int userId,int orderPrivId){
        List<CoursePrivHistoryEntity> coursePrivHistoryEntities=listCoursePrivHistoriesByUserIdAndOrderPrivId(userId,orderPrivId);

        //因为数据库是升序，取最后一行即可
        return coursePrivHistoryEntities.get(coursePrivHistoryEntities.size()-1);
    }

    //删除一系列的历史信息表，锁定一个userId和orderPrivId
    //慎用！！！！
    public boolean removeCoursePrivHistories(int userId,int orderPrivId){
        try{
            coursePrivHistoryDao.deleteByUserIdAndOrderPrivId(userId,orderPrivId);
        }
        catch (Exception e){
            System.out.println("删除私教历史记录出错："+e.getCause()+" "+e.getMessage());
            return false;
        }

        return true;
    }

    //写入一行信息（隐式接口，不直接暴露给前端）
    //待实现！！！
    public boolean addCoursePrivHistory(int userId,int orderPrivId){
        return true;
    }


}
