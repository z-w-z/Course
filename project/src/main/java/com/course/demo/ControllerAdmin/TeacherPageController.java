package com.course.demo.ControllerAdmin;

import com.course.demo.Entity.TeacherEntity;
import com.course.demo.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/AdminPage/TeacherPage")
public class TeacherPageController {
    @Autowired
    TeacherService teacherService;

    //添加一个老师
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    @ResponseBody
    public boolean addTeacher(@RequestBody TeacherEntity teacherEntity){
        return  teacherService.addTeacher(teacherEntity);
    }

    //修改一个老师信息
    //修改老师姓名
    //修改老师头像
    //修改老师介绍
    //修改老师电话

}
