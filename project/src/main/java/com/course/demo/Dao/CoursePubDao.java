package com.course.demo.Dao;

import com.course.demo.Entity.CoursePublicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursePubDao extends JpaRepository<CoursePublicEntity,Integer> {
}
