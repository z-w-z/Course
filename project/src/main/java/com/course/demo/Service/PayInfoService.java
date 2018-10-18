package com.course.demo.Service;

import com.course.demo.Dao.PayInfoDao;
import com.course.demo.Entity.PayInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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

    //3.删除支付信息

    //4.修改支付信息
}
