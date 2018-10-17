package com.course.demo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher", schema = "course", catalog = "")
public class TeacherEntity {
    private int id;
    private String name;
    private String teacherUrl;
    private String intro;
    private String phone;

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
    @Column(name = "teacher_url")
    public String getTeacherUrl() {
        return teacherUrl;
    }

    public void setTeacherUrl(String teacherUrl) {
        this.teacherUrl = teacherUrl;
    }

    @Basic
    @Column(name = "intro")
    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeacherEntity that = (TeacherEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (teacherUrl != null ? !teacherUrl.equals(that.teacherUrl) : that.teacherUrl != null) return false;
        if (intro != null ? !intro.equals(that.intro) : that.intro != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (teacherUrl != null ? teacherUrl.hashCode() : 0);
        result = 31 * result + (intro != null ? intro.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
