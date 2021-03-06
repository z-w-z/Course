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
    public boolean removeUser(int id){
        if(userDao.findById(id)==null)
        {
            System.out.println("删除错误，此用户不存在");
            return false;
        }
        try{
            userDao.deleteById(id);
        }
        catch (Exception e){
            System.out.println("删除一个用户出错："+e.getCause()+" "+e.getMessage());
            return  false;
        }
        return  true;
    }
    //4.修改用户信息
    //修改（更新）微信头像、微信名、微信号暂时不知道怎么写
    //修改会员等级,找到id对应的支付信息，按vip更新
    public boolean updateUserVipById(int id,int vip){
        //看用户是否存在，不存在报错
        if(userDao.findById(id)==null){
            System.out.println("修改失败，该用户不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            UserEntity userEntity=userDao.findById(id);
            userEntity.setVip(vip);
            userDao.save(userEntity);
        }
        catch (Exception e){
            System.out.println("修改用户会员等级出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //修改折扣,找到id对应的支付信息，按discount更新
    public boolean updateUserDiscountById(int id,int discount){
        //看用户是否存在，不存在报错
        if(userDao.findById(id)==null){
            System.out.println("修改失败，该用户不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            UserEntity userEntity=userDao.findById(id);
            userEntity.setDiscount(discount);
            userDao.save(userEntity);
        }
        catch (Exception e){
            System.out.println("修改用户折扣出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //修改电话,找到id对应的支付信息，按phone更新
    public boolean updateUserPhoneById(int id,String phone){
        //看用户是否存在，不存在报错
        if(userDao.findById(id)==null){
            System.out.println("修改失败，该用户不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            UserEntity userEntity=userDao.findById(id);
            userEntity.setPhone(phone);
            userDao.save(userEntity);
        }
        catch (Exception e){
            System.out.println("修改用户电话出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //修改邮箱,找到id对应的支付信息，按email更新
    public boolean updateUserEmailById(int id,String email){
        //看用户是否存在，不存在报错
        if(userDao.findById(id)==null){
            System.out.println("修改失败，该用户不存在");
            return false;
        }
        //通过id找到，修改对应信息
        try {
            UserEntity userEntity=userDao.findById(id);
            userEntity.setEmail(email);
            userDao.save(userEntity);
        }
        catch (Exception e){
            System.out.println("修改用户邮箱出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
}
