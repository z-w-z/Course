package com.course.demo.DTO;

//私教课程完整信息
public class CoursePrivDTO {
    //私教课程基本信息
    private int id;
    private String name;
    private Integer price;
    private String teacherId;

    //老师基本信息
    private String teacherName;
    private String teacherUrl;
    private String intro;
    private String phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTeacherIds() {
        return teacherId;
    }

    public void setTeacherIds(String teacherIds) {
        this.teacherId = teacherIds;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherUrl() {
        return teacherUrl;
    }

    public void setTeacherUrl(String teacherUrl) {
        this.teacherUrl = teacherUrl;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
