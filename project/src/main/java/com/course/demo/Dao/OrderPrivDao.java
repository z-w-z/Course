package com.course.demo.Dao;

import com.course.demo.Entity.OrderPrivateEntity;
import com.course.demo.Entity.OrderPrivateEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderPrivDao extends JpaRepository<OrderPrivateEntity,OrderPrivateEntityPK> {
}
