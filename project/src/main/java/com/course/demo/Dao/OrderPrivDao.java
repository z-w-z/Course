package com.course.demo.Dao;

import com.course.demo.Entity.OrderPrivateEntity;
import com.course.demo.Entity.OrderPrivateEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderPrivDao extends JpaRepository<OrderPrivateEntity,OrderPrivateEntityPK> {

    OrderPrivateEntity findByUserIdAndCoursePrivId(int userId,int CourseId);
    List<OrderPrivateEntity> findByUserId(int UserId);
    List<OrderPrivateEntity> findByCoursePrivId(int CourseId);
    void deleteByUserIdAndCoursePrivId(int userId,int CourseId);
}
