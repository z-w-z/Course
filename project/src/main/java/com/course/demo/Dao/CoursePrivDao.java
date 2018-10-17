package com.course.demo.Dao;

import com.course.demo.Entity.CoursePrivateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursePrivDao extends JpaRepository<CoursePrivateEntity,Integer> {
    CoursePrivateEntity findById(int id);

}
