package com.course.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "order_public", schema = "course", catalog = "")
@IdClass(OrderPublicEntityPK.class)
public class OrderPublicEntity {
    private int coursePubId;
    private int userId;
    private Integer payMoney;
    private Integer status;
    private Integer peopleNumber;

    @Id
    @Column(name = "course_pub_id")
    public int getCoursePubId() {
        return coursePubId;
    }

    public void setCoursePubId(int coursePubId) {
        this.coursePubId = coursePubId;
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
    @Column(name = "pay_money")
    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "people_number")
    public Integer getPeopleNumber() {
        return peopleNumber;
    }

    public void setPeopleNumber(Integer peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderPublicEntity that = (OrderPublicEntity) o;

        if (coursePubId != that.coursePubId) return false;
        if (userId != that.userId) return false;
        if (payMoney != null ? !payMoney.equals(that.payMoney) : that.payMoney != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (peopleNumber != null ? !peopleNumber.equals(that.peopleNumber) : that.peopleNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = coursePubId;
        result = 31 * result + userId;
        result = 31 * result + (payMoney != null ? payMoney.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (peopleNumber != null ? peopleNumber.hashCode() : 0);
        return result;
    }
}
