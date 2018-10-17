package com.course.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CoursePrivHistoryEntityPK implements Serializable {
    private int userId;
    private int orderPrivId;

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "order_priv_id")
    @Id
    public int getOrderPrivId() {
        return orderPrivId;
    }

    public void setOrderPrivId(int orderPrivId) {
        this.orderPrivId = orderPrivId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursePrivHistoryEntityPK that = (CoursePrivHistoryEntityPK) o;

        if (userId != that.userId) return false;
        if (orderPrivId != that.orderPrivId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + orderPrivId;
        return result;
    }
}
