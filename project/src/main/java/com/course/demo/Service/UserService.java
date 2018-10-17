package com.course.demo.Service;


import com.course.demo.Dao.UserDao;
import com.course.demo.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//处理user和userAccount两张表
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    //返回所有User,按ID升序（还没实现）
    public List<UserEntity> listAllUsers(){
        return userDao.findAll();
    }

    //通过id找User
    public UserEntity getUserById(int id){

        return new UserEntity();
    }

    //通过电话找User

    //通过VIP找User
    public List<UserEntity>  listUsersByVip(int vip){
        return userDao.findByVip(vip);
    }

    //添加一个User，微信读入



}
