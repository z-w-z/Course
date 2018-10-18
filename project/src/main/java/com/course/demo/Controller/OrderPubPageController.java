package com.course.demo.Controller;

import com.course.demo.Entity.OrderPublicEntity;
import com.course.demo.Service.OrderPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/AdminPage/OrderPubPage")
public class OrderPubPageController {
    @Autowired
    OrderPubService orderPubService;

    //添加一个公共课订单
    @RequestMapping(value = "/addOrderPubPage")
    @ResponseBody
    public boolean addOrderPub(@RequestBody OrderPublicEntity orderPublicEntity){
        return orderPubService.addOrderPub(orderPublicEntity);
    }
}
