package com.course.demo.ControllerUser;

import com.course.demo.DTO.OrderPrivDTO;
import com.course.demo.DTO.OrderPubDTO;
import com.course.demo.Service.OrderPrivService;
import com.course.demo.Service.OrderPubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OrderPage")
public class OrderPage {
    @Autowired
    OrderPubService orderPubService;

    @Autowired
    OrderPrivService orderPrivService;

    //用户获取自己的所有公共课订单
    @RequestMapping(value = "/listAllOrderPubByUserId",method = RequestMethod.GET)
    @ResponseBody
    public List<OrderPubDTO> listAllOrderPubByUserId(@RequestParam("userId") int userId){
        return orderPubService.getByUserId(userId);
    }

    //用户通过公共课订单ID获取该订单
    @RequestMapping(value = "/getOrderPubById",method = RequestMethod.GET)
    @ResponseBody
    public OrderPubDTO getOrderPubById(@RequestParam("id") int id){
        return orderPubService.getById(id);
    }

    //用户获取自己的所有私教课订单
    @RequestMapping(value = "/listAllOrderPrivByUserId",method = RequestMethod.GET)
    @ResponseBody
    public List<OrderPrivDTO> listAllOrderPrivByUserId(@RequestParam("userId") int userId){
        return orderPrivService.listByUserId(userId);
    }

    //用户通过自己的id和私教课订单id获取该订单
    @RequestMapping(value = "/getOrderPrivByUserIdAndCoursePrivId",method = RequestMethod.GET)
    @ResponseBody
    public OrderPrivDTO getOrderPrivByCoursePrivId(@RequestParam("userId") int userId,
                                                   @RequestParam("coursePrivId") int coursePrivId){
        return orderPrivService.getByUserIdAndCourseId(userId,coursePrivId);
    }
}
