package com.course.demo.Controller;

import com.course.demo.Entity.OrderPublicEntity;
import com.course.demo.Service.OrderPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/AdminPage/OrderPubPage")
public class OrderPubPageController {
    @Autowired
    OrderPubService orderPubService;

    //添加一个公共课订单
    @RequestMapping(value = "/addOrderPublic",method = RequestMethod.POST)
    @ResponseBody
    public boolean addOrderPub(@RequestBody OrderPublicEntity orderPublicEntity){
        return orderPubService.addOrderPub(orderPublicEntity);
    }
}
