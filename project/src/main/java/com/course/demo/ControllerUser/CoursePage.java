package com.course.demo.ControllerUser;

import com.course.demo.DTO.CoursePrivDTO;
import com.course.demo.DTO.CoursePubDTO;
import com.course.demo.Dao.CoursePrivDao;
import com.course.demo.Entity.CoursePrivateEntity;
import com.course.demo.Service.CoursePrivService;
import com.course.demo.Service.CoursePubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/CoursePage")
public class CoursePage {
    @Autowired
    CoursePubService coursePubService;

    @Autowired
    CoursePrivService coursePrivService;

    @Autowired
    CoursePrivDao coursePrivDao;

    //通过日期返回公共课程
    @RequestMapping(value = "listCoursePubByDate",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePubDTO> listCoursePubByDate(@RequestParam("whatDate") Date whatDate){
        return coursePubService.listCoursePubByWhatDay(whatDate);
    }

    //通过公共课程id返回该课程
    @RequestMapping(value = "getCoursePubById",method = RequestMethod.GET)
    @ResponseBody
    public CoursePubDTO getCoursePubById(@RequestParam("id") int id){
        return coursePubService.getCoursePublicById(id);
    }

    //返回所有私教课程，简约版信息
    @RequestMapping(value = "/listAllCoursePriv",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePrivateEntity> listAllCoursePriv(){
        return coursePrivDao.findAll();
    }

    //通过私教课的teacherId获取老师列表
    @RequestMapping(value = "/listCoursePrivByTeacherId",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePrivDTO> listCoursePrivByTeacherId(@RequestParam("teacherId") int teacherId){
        return coursePrivService.listCoursePrivDTOByTeacherId(teacherId);
    }

    //通过私教课id获取私教课详细信息
    @RequestMapping(value = "/getCoursePrivById",method = RequestMethod.GET)
    @ResponseBody
    public CoursePrivDTO getCoursePrivById(@RequestParam("id") int id){
        return coursePrivService.getCoursePrivDTOById(id);
    }
}
