package com.course.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "course_private", schema = "course", catalog = "")
public class CoursePrivateEntity {
    private int id;
    private String name;
    private Integer price;
    private Integer teacherId;
    private String coursePrivUrl;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "teacher_id")
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Basic
    @Column(name = "course_priv_url")
    public String getCoursePrivUrl() {
        return coursePrivUrl;
    }

    public void setCoursePrivUrl(String coursePrivUrl) {
        this.coursePrivUrl = coursePrivUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursePrivateEntity that = (CoursePrivateEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (teacherId != null ? !teacherId.equals(that.teacherId) : that.teacherId != null) return false;
        if (coursePrivUrl != null ? !coursePrivUrl.equals(that.coursePrivUrl) : that.coursePrivUrl != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (teacherId != null ? teacherId.hashCode() : 0);
        result = 31 * result + (coursePrivUrl != null ? coursePrivUrl.hashCode() : 0);
        return result;
    }
}
