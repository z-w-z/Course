package com.course.demo.Dao;

import com.course.demo.Entity.OrderPublicEntity;
import com.course.demo.Entity.OrderPublicEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderPubDao extends JpaRepository<OrderPublicEntity,OrderPublicEntityPK> {

    List<OrderPublicEntity> findByCoursePubId(int course_pub_id);
    List<OrderPublicEntity> findByUserId(int user_id);
    List<OrderPublicEntity> findByCoursePubIdAndUserId(int course_pub_id,int user_id);

    void deleteByCoursePubIdAndUserId(int course_pub_id,int user_id);
}
