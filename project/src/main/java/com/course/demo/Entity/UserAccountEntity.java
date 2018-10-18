package com.course.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user_account", schema = "course", catalog = "")
public class UserAccountEntity {
    private int id;
    private Integer balance;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "balance")
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAccountEntity that = (UserAccountEntity) o;

        if (id != that.id) return false;
        if (balance != null ? !balance.equals(that.balance) : that.balance != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        return result;
    }
}
