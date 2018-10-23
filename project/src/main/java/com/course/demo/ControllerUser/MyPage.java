package com.course.demo.ControllerUser;

import com.course.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/MyPage")
public class MyPage {
    @Autowired
    UserService userService;


}
