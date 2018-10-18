package com.course.demo.Service;

import com.course.demo.Dao.OrderPubDao;
import com.course.demo.Entity.OrderPublicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderPubService {
    @Autowired
    OrderPubDao orderPubDao;
    //1.查找公共课订单
    //返回所有公共课信息，按id升序
    public List<OrderPublicEntity> listAllOrderPublic(){
        Sort sort=new Sort(Sort.Direction.ASC,"id");
        return orderPubDao.findAll(sort);
    }
    //通过course_pub_id查找order_public
    public List<OrderPublicEntity> listOrderPublicByCoursePubId(int course_pub_id){
        return orderPubDao.findByCoursePubId(course_pub_id);
    }
    //通过user_id查找order_public
    public  List<OrderPublicEntity> listOrderPublicByUserId(int user_id){
        return orderPubDao.findByUserId(user_id);
    }
    //通过course_pub_id和user_id联合查找order_public
    public  List<OrderPublicEntity> listOrderPublicByCoursePubIdAndUserId(int course_pub_id,int user_id){
        return orderPubDao.findByCoursePubIdAndUserId(course_pub_id, user_id);
    }
    //2.添加公共课订单

    //3.删除公共课订单

    //4.修改公共课订单
}
