package com.course.demo.Dao;

import com.course.demo.Entity.PayInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayInfoDao extends JpaRepository<PayInfoEntity,Integer> {
}
