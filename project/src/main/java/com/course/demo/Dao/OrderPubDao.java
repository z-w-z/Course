package com.course.demo.Dao;

import com.course.demo.Entity.OrderPublicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface OrderPubDao extends JpaRepository<OrderPublicEntity,Integer> {
     List<OrderPublicEntity> findByUserIdAndCoursePubId(int UserId,int CourseId);
     void deleteByUserIdAndCoursePubId(int userId,int courseId);
     List<OrderPublicEntity> findByStatus(int status);
     List<OrderPublicEntity> findByUserId(int userId);
     OrderPublicEntity findById(int id);
}
