package com.course.demo.DTO;

import java.sql.Date;

public class OrderPubDTO {
    //订单信息
    private int id;
    private int coursePubId;
    private int userId;
    private Integer payMoney;
    private Integer status;
    private Integer peopleNumber;

    //课程信息
    private String coursePubName;
    private Integer coursePubPrice;
    private String coursePubDateRange;
    private String coursePubAddr;
    private Date coursePubWhatDay;
    private String coursePubWeekDay;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoursePubId() {
        return coursePubId;
    }

    public void setCoursePubId(int coursePubId) {
        this.coursePubId = coursePubId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public String getCoursePubName() {
        return coursePubName;
    }

    public void setCoursePubName(String coursePubName) {
        this.coursePubName = coursePubName;
    }

    public Integer getCoursePubPrice() {
        return coursePubPrice;
    }

    public void setCoursePubPrice(Integer coursePubPrice) {
        this.coursePubPrice = coursePubPrice;
    }

    public String getCoursePubDateRange() {
        return coursePubDateRange;
    }

    public void setCoursePubDateRange(String coursePubDateRange) {
        this.coursePubDateRange = coursePubDateRange;
    }

    public String getCoursePubAddr() {
        return coursePubAddr;
    }

    public void setCoursePubAddr(String coursePubAddr) {
        this.coursePubAddr = coursePubAddr;
    }

    public Date getCoursePubWhatDay() {
        return coursePubWhatDay;
    }

    public void setCoursePubWhatDay(Date coursePubWhatDay) {
        this.coursePubWhatDay = coursePubWhatDay;
    }

    public String getCoursePubWeekDay() {
        return coursePubWeekDay;
    }

    public void setCoursePubWeekDay(String coursePubWeekDay) {
        this.coursePubWeekDay = coursePubWeekDay;
    }
}
