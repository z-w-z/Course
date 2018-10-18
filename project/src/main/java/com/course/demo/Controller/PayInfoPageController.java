package com.course.demo.Controller;

import com.course.demo.Entity.PayInfoEntity;
import com.course.demo.Service.PayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/AdminPage/PayInfoPage")
public class PayInfoPageController {
    @Autowired
    PayInfoService payInfoService;

    //添加一个支付信息
    @RequestMapping(value="/addPayInfo",method = RequestMethod.POST)
    @ResponseBody
    public boolean addPayInfo(@RequestBody PayInfoEntity payInfoEntity){
        return payInfoService.addPayInfo(payInfoEntity);
    }
}
