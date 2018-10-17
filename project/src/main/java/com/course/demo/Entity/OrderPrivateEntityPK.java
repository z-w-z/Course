package com.course.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrderPrivateEntityPK implements Serializable {
    private int coursePrivId;
    private int userId;

    @Column(name = "course_priv_id")
    @Id
    public int getCoursePrivId() {
        return coursePrivId;
    }

    public void setCoursePrivId(int coursePrivId) {
        this.coursePrivId = coursePrivId;
    }

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPrivateEntityPK that = (OrderPrivateEntityPK) o;

        if (coursePrivId != that.coursePrivId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coursePrivId;
        result = 31 * result + userId;
        return result;
    }
}
