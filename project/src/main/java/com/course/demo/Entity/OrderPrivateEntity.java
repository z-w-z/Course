package com.course.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "order_private", schema = "course", catalog = "")
@IdClass(OrderPrivateEntityPK.class)
public class OrderPrivateEntity {
    private int coursePrivId;
    private int userId;
    private Integer totalClass;

    @Id
    @Column(name = "course_priv_id")
    public int getCoursePrivId() {
        return coursePrivId;
    }

    public void setCoursePrivId(int coursePrivId) {
        this.coursePrivId = coursePrivId;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "total_class")
    public Integer getTotalClass() {
        return totalClass;
    }

    public void setTotalClass(Integer totalClass) {
        this.totalClass = totalClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPrivateEntity that = (OrderPrivateEntity) o;

        if (coursePrivId != that.coursePrivId) return false;
        if (userId != that.userId) return false;
        if (totalClass != null ? !totalClass.equals(that.totalClass) : that.totalClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coursePrivId;
        result = 31 * result + userId;
        result = 31 * result + (totalClass != null ? totalClass.hashCode() : 0);
        return result;
    }
}
