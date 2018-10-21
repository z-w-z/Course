package com.course.demo.Service;

import com.course.demo.Dao.PayInfoDao;
import com.course.demo.Entity.PayInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
@Service
public class PayInfoService {
    @Autowired
    PayInfoDao payInfoDao;
    //1.查找支付信息
    //返回所有支付信息，按id升序
    public List<PayInfoEntity> listAllPayInfo(){
        Sort sort=new Sort(Sort.Direction.ASC,"id");
        return payInfoDao.findAll(sort);
    }
    //通过id找支付信息
    public PayInfoEntity getPayInfoById(int id){
        return new PayInfoEntity();
    }
    //通过user_id找支付信息
    public List<PayInfoEntity> listPayInfoByUserId(int user_id){
        return payInfoDao.findByUserId(user_id);
    }
    //通过时间找支付信息
    public List<PayInfoEntity> listPayInfoByDateTime(Date dateTime){
        return payInfoDao.findByDate(dateTime);
    }
    //2.添加支付信息
    //添加一个订单
    public boolean addPayInfo(PayInfoEntity payInfoEntity){
        //判断输入的user_id是否为空
        if(payInfoEntity.getUserId()==null){
            System.out.println("添加失败，该用户为空");
            return false;
        }
        //判断输入的user_id是否存在
        else if(payInfoDao.findByUserId(payInfoEntity.getUserId())==null){
            System.out.println("添加失败，该用户不存在");
            return false;
        }
        try{
            //获取当前系统时间
            Timestamp currentTime=new Timestamp(System.currentTimeMillis());
            payInfoEntity.setDate(currentTime);
            payInfoDao.save(payInfoEntity);
        }
        catch(Exception e){
            System.out.println("添加支付信息出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //3.删除支付信息
    public boolean removePayInfo(int id){
        if(payInfoDao.findById(id)==null){
            System.out.println("删除错误，此支付信息不存在");
            return false;
        }
        try {
            payInfoDao.deleteById(id);
        }
        catch (Exception e){
            System.out.println("删除一个支付信息出错："+e.getCause()+" "+e.getMessage());
            return false;
        }
        return true;
    }
    //4.修改支付信息
    //慎用！！！
    //修改用户,找到id对应的支付信息，按user_id更新
    //修改日期,找到id对应的支付信息，按user_id更新
    //修改付款数,找到id对应的支付信息，按user_id更新
}
