package com.course.demo.Controller;

import com.course.demo.Data.RemoteData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    RemoteData remoteData;

    @RequestMapping(value = "/test1",method =RequestMethod.GET)
    public int get1(){
        return remoteData.getRechargeMoney();
    }

    @RequestMapping(value = "/test2",method =RequestMethod.GET)
    public int get2(){
        return remoteData.getRechargeMoney();
    }

    @RequestMapping(value = "/test3",method =RequestMethod.GET)
    public void set(@RequestParam("a") int a){
       remoteData.setRechargeMoney(a);
    }

}
