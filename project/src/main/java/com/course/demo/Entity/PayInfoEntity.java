package com.course.demo.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "pay_info", schema = "course", catalog = "")
public class PayInfoEntity {
    private int id;
    private Integer userId;
    private Timestamp date;
    private Integer payMoney;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "pay_money")
    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PayInfoEntity that = (PayInfoEntity) o;

        if (id != that.id) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (payMoney != null ? !payMoney.equals(that.payMoney) : that.payMoney != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (payMoney != null ? payMoney.hashCode() : 0);
        return result;
    }
}
