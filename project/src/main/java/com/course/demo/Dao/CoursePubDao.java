package com.course.demo.Dao;

import com.course.demo.Entity.CoursePublicEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface CoursePubDao extends JpaRepository<CoursePublicEntity,Integer> {
    CoursePublicEntity findById(int id);
    CoursePublicEntity findByName(String name);
    List<CoursePublicEntity> findByWhatDay(Date whatDay);
    List<CoursePublicEntity> findByTeacherId(int teacherId);
}
