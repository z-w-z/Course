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

    private String code="delete";

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
    public boolean removeCoursePrivHistories(int userId,int orderPrivId,String code){
        //使用code避免误操作
        if(code!=this.code)
            return false;
        try{
            coursePrivHistoryDao.deleteByUserIdAndOrderPrivId(userId,orderPrivId);
        }
        catch (Exception e){
            System.out.println("删除私教历史记录出错："+e.getCause()+" "+e.getMessage());
            return false;
        }

        return true;
    }

    //购买私教写入一行信息
    //更新条目待实现！！！
    public boolean addCoursePrivHistory(CoursePrivHistoryEntity coursePrivHistoryEntity){
        //需要判断是否存在该条记录
        //存在，递增节数
        //不存在，新增条目
        if(coursePrivHistoryDao.findByUserIdAndOrderPrivId(coursePrivHistoryEntity.getUserId(),coursePrivHistoryEntity.getOrderPrivId())==null){
            try{
                coursePrivHistoryDao.save(coursePrivHistoryEntity);
            }catch (Exception e){
                System.out.println("添加一个私教信息："+e.getCause()+" "+e.getMessage());
                return false;
            }
        }
        else{
            //更新条目
        }



        return true;
    }

    //上完一节私教更改一行信息
    //一次加一节课
    //未实现
    public boolean updateCurrentNum(){
        try{

        }catch (Exception e){
            System.out.println("修改私教CurrentNum出错"+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }


}
