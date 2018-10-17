package com.course.demo.Dao;

import com.course.demo.Entity.OrderPublicEntity;
import com.course.demo.Entity.OrderPublicEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPubDao extends JpaRepository<OrderPublicEntity,OrderPublicEntityPK> {
}
