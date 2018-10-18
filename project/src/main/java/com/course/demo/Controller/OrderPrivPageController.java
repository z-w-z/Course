package com.course.demo.Controller;

import com.course.demo.Entity.OrderPrivateEntity;
import com.course.demo.Service.OrderPrivService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/AdminPage/OrderPrivPage")
public class OrderPrivPageController {
    @Autowired
    OrderPrivService orderPrivService;

    //添加一个私教课订单
    @RequestMapping(value = "/addOrderPrivate",method = RequestMethod.POST)
    @ResponseBody
    public boolean addOrderPrivate(@RequestBody OrderPrivateEntity orderPrivateEntity){
        return orderPrivService.addOrderPriv(orderPrivateEntity);
    }
}
