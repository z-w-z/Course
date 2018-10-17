package com.course.demo.Dao;

import com.course.demo.Entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherDao extends JpaRepository<TeacherEntity,Integer> {
}
