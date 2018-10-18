package com.course.demo.Controller;

import com.course.demo.Entity.OrderPrivateEntity;
import com.course.demo.Service.OrderPrivService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/AdminPage/OrderPrivPage")
public class OrderPrivPageController {
    @Autowired
    OrderPrivService orderPrivService;

    //添加一个私教课订单
    @RequestMapping(value = "/addOrderPrivPage")
    @ResponseBody
    public boolean addOrderPriv(@RequestBody OrderPrivateEntity orderPrivateEntity){
        return orderPrivService.addOrderPriv(orderPrivateEntity);
    }
}
