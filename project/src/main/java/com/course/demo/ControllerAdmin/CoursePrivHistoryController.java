package com.course.demo.ControllerAdmin;

import com.course.demo.Entity.CoursePrivHistoryEntity;
import com.course.demo.Service.CoursePrivHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Admin/CoursePrivHistory")
public class CoursePrivHistoryController {
    @Autowired
    CoursePrivHistoryService coursePrivHistoryService;

    //=============================================查找
    //获取所有记录
    @RequestMapping(value = "listAllCoursePrivHistory",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePrivHistoryEntity> listAllCoursePrivHistory(){
        return coursePrivHistoryService.listAllCoursePrivHistories();
    }

    //通过userId和orderPrivId返回私教课历史信息表
    @RequestMapping(value = "listCoursePrivHistoryByUserIdAndOrderPrivId",method = RequestMethod.GET)
    @ResponseBody
    public List<CoursePrivHistoryEntity> listCoursePrivHistoryByUserIdAndOrderPrivId(@RequestParam("userId") int userId,
                                                                                     @RequestParam("orderPrivId") int orderPrivId){
        return coursePrivHistoryService.listCoursePrivHistoriesByUserIdAndOrderPrivId(userId,orderPrivId);
    }

    //通过userId和orderPrivId返回私教课最新历史信息
    @RequestMapping(value = "getCoursePrivHistoryByUserIdAndOrderPrivId",method = RequestMethod.GET)
    @ResponseBody
    public CoursePrivHistoryEntity getCoursePrivHistoryByUserIdAndOrderPrivId(@RequestParam("userId") int userId,
                                                                              @RequestParam("orderPrivId") int orderPrivId){
        return coursePrivHistoryService.getCoursePrivHistoryByUserIdAndOrderPrivId(userId,orderPrivId);
    }

    //=============================================删除
    //删除一系列的历史信息表，锁定一个userId和orderPrivId
    //慎用！！！！要获取code再删除
    @RequestMapping(value = "removeCoursePrivHistoriesWithCode",method = RequestMethod.GET)
    @ResponseBody
    public boolean removeCoursePrivHistoriesWithCode(@RequestParam("userId") int userId,
                                                     @RequestParam("orderPrivId") int orderPrivId,@RequestParam("code") String code){
        return coursePrivHistoryService.removeCoursePrivHistories(userId,orderPrivId,code);
    }

    //=============================================新增


    //=============================================修改
}
