package com.course.demo.ControllerUser;

import com.course.demo.Service.CoursePrivService;
import com.course.demo.Service.CoursePubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/CoursePage")
public class CoursePage {
    @Autowired
    CoursePubService coursePubService;

    @Autowired
    CoursePrivService coursePrivService;
}
