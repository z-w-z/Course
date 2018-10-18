package com.course.demo.Dao;

import com.course.demo.Entity.OrderPrivateEntity;
import com.course.demo.Entity.OrderPrivateEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderPrivDao extends JpaRepository<OrderPrivateEntity,OrderPrivateEntityPK> {
    List<OrderPrivateEntity> findByCoursePrivId(int course_priv_id);
    List<OrderPrivateEntity> findByUserId(int user_id);
    List<OrderPrivateEntity> findByCoursePrivIdAndUserId(int course_priv_id,int user_id);

    void deleteByCoursePrivIdAndUserId(int course_priv_id,int user_id);
}
