package com.course.demo.Service;


import com.course.demo.Dao.UserDao;
import com.course.demo.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

//处理user和userAccount两张表
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    //1.查找用户

    //返回所有User,按ID升序（还没实现）
    public List<UserEntity> listAllUsers(){
        Sort sort=new Sort(Sort.Direction.ASC,"id");
        return userDao.findAll(sort);
    }

    //通过id找User
    public UserEntity getUserById(int id){

        return new UserEntity();
    }

    //通过phone找User
    public UserEntity getUserByPhone(String phone){
        return new UserEntity();
    }
    //通过VIP找User
    public List<UserEntity>  listUsersByVip(int vip){

        return userDao.findByVip(vip);
    }

    //2.添加用户（从微信添加）

    //添加一个User，微信读入

    //3.删除用户

    //4.修改用户信息


}
