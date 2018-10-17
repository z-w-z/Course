package com.course.demo.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "course_priv_history", schema = "course", catalog = "")
@IdClass(CoursePrivHistoryEntityPK.class)
public class CoursePrivHistoryEntity {
    private int userId;
    private int orderPrivId;
    private Integer currentNum;
    private Integer totalNum;
    private Timestamp date;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "order_priv_id")
    public int getOrderPrivId() {
        return orderPrivId;
    }

    public void setOrderPrivId(int orderPrivId) {
        this.orderPrivId = orderPrivId;
    }

    @Basic
    @Column(name = "current_num")
    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    @Basic
    @Column(name = "total_num")
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoursePrivHistoryEntity that = (CoursePrivHistoryEntity) o;

        if (userId != that.userId) return false;
        if (orderPrivId != that.orderPrivId) return false;
        if (currentNum != null ? !currentNum.equals(that.currentNum) : that.currentNum != null) return false;
        if (totalNum != null ? !totalNum.equals(that.totalNum) : that.totalNum != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + orderPrivId;
        result = 31 * result + (currentNum != null ? currentNum.hashCode() : 0);
        result = 31 * result + (totalNum != null ? totalNum.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
