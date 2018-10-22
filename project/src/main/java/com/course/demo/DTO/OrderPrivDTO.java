package com.course.demo.DTO;

public class OrderPrivDTO {
    //订单信息
    private int coursePrivId;
    private int userId;
    private Integer totalClass;

    //私教课信息
    private String coursePrivName;
    private Integer coursePrivPrice;
    private Integer teacherId;

    //老师信息
    private String teacherName;

    public int getCoursePrivId() {
        return coursePrivId;
    }

    public void setCoursePrivId(int coursePrivId) {
        this.coursePrivId = coursePrivId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getTotalClass() {
        return totalClass;
    }

    public void setTotalClass(Integer totalClass) {
        this.totalClass = totalClass;
    }

    public String getCoursePrivName() {
        return coursePrivName;
    }

    public void setCoursePrivName(String coursePrivName) {
        this.coursePrivName = coursePrivName;
    }

    public Integer getCoursePrivPrice() {
        return coursePrivPrice;
    }

    public void setCoursePrivPrice(Integer coursePrivPrice) {
        this.coursePrivPrice = coursePrivPrice;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
