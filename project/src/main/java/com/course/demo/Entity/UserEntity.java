package com.course.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "course", catalog = "")
public class UserEntity {
    private int id;
    private Integer openId;
    private Integer vip;
    private Integer discount;
    private String wxName;
    private String wxUrl;
    private String phone;
    private String email;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "open_id")
    public Integer getOpenId() {
        return openId;
    }

    public void setOpenId(Integer openId) {
        this.openId = openId;
    }

    @Basic
    @Column(name = "vip")
    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    @Basic
    @Column(name = "discount")
    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "wx_name")
    public String getWxName() {
        return wxName;
    }

    public void setWxName(String wxName) {
        this.wxName = wxName;
    }

    @Basic
    @Column(name = "wx_url")
    public String getWxUrl() {
        return wxUrl;
    }

    public void setWxUrl(String wxUrl) {
        this.wxUrl = wxUrl;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (openId != null ? !openId.equals(that.openId) : that.openId != null) return false;
        if (vip != null ? !vip.equals(that.vip) : that.vip != null) return false;
        if (discount != null ? !discount.equals(that.discount) : that.discount != null) return false;
        if (wxName != null ? !wxName.equals(that.wxName) : that.wxName != null) return false;
        if (wxUrl != null ? !wxUrl.equals(that.wxUrl) : that.wxUrl != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (openId != null ? openId.hashCode() : 0);
        result = 31 * result + (vip != null ? vip.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (wxName != null ? wxName.hashCode() : 0);
        result = 31 * result + (wxUrl != null ? wxUrl.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
