package com.course.demo.Dao;

import com.course.demo.Entity.CoursePrivateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursePrivDao extends JpaRepository<CoursePrivateEntity,Integer> {
    CoursePrivateEntity findById(int id);
    CoursePrivateEntity findByName(String name);
    List<CoursePrivateEntity> findByTeacherId(int teacherId);

}
