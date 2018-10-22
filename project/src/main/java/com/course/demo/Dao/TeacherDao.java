package com.course.demo.Dao;

import com.course.demo.Entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherDao extends JpaRepository<TeacherEntity,Integer> {
    TeacherEntity findById(int id);
    TeacherEntity findByPhone(String phone);

    List<TeacherEntity> findByName(String name);
    //List<TeacherEntity> findAll();
    void deleteById(int id);
}
