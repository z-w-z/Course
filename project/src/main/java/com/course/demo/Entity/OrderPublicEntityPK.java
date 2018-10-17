package com.course.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class OrderPublicEntityPK implements Serializable {
    private int coursePubId;
    private int userId;

    @Column(name = "course_pub_id")
    @Id
    public int getCoursePubId() {
        return coursePubId;
    }

    public void setCoursePubId(int coursePubId) {
        this.coursePubId = coursePubId;
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

        OrderPublicEntityPK that = (OrderPublicEntityPK) o;

        if (coursePubId != that.coursePubId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coursePubId;
        result = 31 * result + userId;
        return result;
    }
}
