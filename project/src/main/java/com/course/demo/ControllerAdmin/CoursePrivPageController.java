package com.course.demo.ControllerAdmin;

import com.course.demo.DTO.CoursePrivDTO;
import com.course.demo.Entity.CoursePrivateEntity;
import com.course.demo.Service.CoursePrivService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Admin/CoursePrivPage")
public class CoursePrivPageController {
    @Autowired
    CoursePrivService coursePrivService;

    //=============================================查找
    //展示所有的私教课程
    @RequestMapping(value = "/listAllCoursePrivate",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePrivDTO> listAllCoursePrivate(){
        return coursePrivService.listAllCoursePriv();
    }

    //通过teacherId获取公共课程
    @RequestMapping(value = "/listCoursePrivByTeacherId",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePrivDTO> listCoursePrivByTeacherId(@RequestParam("teacherId") int teacherId){
        return coursePrivService.listCoursePrivByTeacherId(teacherId);
    }

    //通过名字获取公共课程
    @RequestMapping(value = "/getCoursePrivByName",method = RequestMethod.GET)
    @ResponseBody
    public CoursePrivDTO getCoursePrivByName(@RequestParam("name") String name){
        return coursePrivService.getCoursePrivByName(name);
    }

    //通过ID获取公共课程
    @RequestMapping(value = "/getCoursePrivById",method = RequestMethod.GET)
    @ResponseBody
    public CoursePrivDTO getCoursePrivById(@RequestParam("id") int id){
        return coursePrivService.getCoursePrivById(id);
    }

    //=============================================删除
    //通过ID删除一个公共课程
    @RequestMapping(value = "/removeCoursePrivById",method = RequestMethod.GET)
    @ResponseBody
    public boolean removeCoursePrivById(@RequestParam("id") int id){
        return coursePrivService.removeCoursePriv(id);
    }

    //=============================================新增
    //新增一个公共课程
    @RequestMapping(value = "/addCoursePriv",method = RequestMethod.POST)
    @ResponseBody
    public boolean addCoursePriv(@RequestBody CoursePrivateEntity coursePrivateEntity){
        return coursePrivService.addCoursePriv(coursePrivateEntity);
    }

    //=============================================修改
}
