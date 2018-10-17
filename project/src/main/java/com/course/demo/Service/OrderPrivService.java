package com.course.demo.Service;

import com.course.demo.Dao.OrderPrivDao;
import com.course.demo.Entity.OrderPrivateEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderPrivService {
    @Autowired
    OrderPrivDao orderPrivDao;
    //1.查找私教课
    //返回所有私教课信息，按id升序
    public  List<OrderPrivateEntity> listAllOrderPrivate(){
        Sort sort=new Sort(Sort.Direction.ASC,"id");
        return orderPrivDao.findAll(sort);
    }
    //通过course_priv_id查找
    public  List<OrderPrivateEntity> listAllOrderPrivateByCoursePrivId(int course_priv_id){
        return orderPrivDao.findByCoursePrivId(course_priv_id);
    }
    //通过user_id查找
    public List<OrderPrivateEntity> listAllOrderPrivateByUserId(int user_id){
        return orderPrivDao.findByUserId(user_id);
    }
    //通过course_priv_id和user_id联合查找
    public List<OrderPrivateEntity> listAllOrderPrivateByCoursePrivIdAndUserId(int course_priv_id,int user_id){
        return orderPrivDao.findByCoursePrivIdAndUserId(course_priv_id, user_id);
    }
    //2.添加私教课

    //3.删除私教课

    //4.修改私教课
}
