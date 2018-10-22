package com.course.demo.ControllerAdmin;

import com.course.demo.DTO.CoursePubDTO;
import com.course.demo.Entity.CoursePublicEntity;
import com.course.demo.Service.CoursePubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/Admin/CoursePubPage")
public class CoursePubPageController {
    @Autowired
    CoursePubService coursePubService;

    //=============================================查找
    //展示所有的公共课程
    @RequestMapping(value = "/listAllCoursePublic",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePubDTO> listAllCoursePublic(){
        return coursePubService.listAllCoursePublic();
    }

    //通过哪一天筛选公共课程
    @RequestMapping(value = "/listCoursePubByWhatDay",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePubDTO> listCoursePubByWhatDay(@RequestParam("whatDay") Date whatDay){
        return coursePubService.listCoursePubByWhatDay(whatDay);
    }

    //通过teacherId获取公共课程
    @RequestMapping(value = "/listCoursePubByTeacherId",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePubDTO> listCoursePubByTeacherId(@RequestParam("teacherId") int teacherId){
        return coursePubService.listCoursePublicByTeacherId(teacherId);
    }

    //通过名字获取公共课程
    @RequestMapping(value = "/getCoursePubByName",method = RequestMethod.GET)
    @ResponseBody
    public CoursePubDTO getCoursePubByName(@RequestParam("name") String name){
        return coursePubService.getCoursePublicByName(name);
    }

    //通过ID获取公共课程
    @RequestMapping(value = "/getCoursePubById",method = RequestMethod.GET)
    @ResponseBody
    public CoursePubDTO getCoursePubById(@RequestParam("id") int id){
        return coursePubService.getCoursePublicById(id);
    }

    //=============================================删除
    //通过ID删除一个公共课程
    @RequestMapping(value = "/removeCoursePubById",method = RequestMethod.GET)
    @ResponseBody
    public boolean removeCoursePubById(@RequestParam("id") int id){
        return coursePubService.removeCoursePublic(id);
    }

    //=============================================新增
    //新增一个公共课程
    @RequestMapping(value = "/addCoursePub",method = RequestMethod.POST)
    @ResponseBody
    public boolean addCoursePub(@RequestBody CoursePublicEntity coursePublicEntity){
        return coursePubService.addCoursePublic(coursePublicEntity);
    }

    //=============================================修改

}
