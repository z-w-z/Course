package com.course.demo.Dao;

import com.course.demo.Entity.PayInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;

public interface PayInfoDao extends JpaRepository<PayInfoEntity,Integer> {
    PayInfoEntity findById(int id);

    List<PayInfoEntity> findByUserId(int user_id);
    List<PayInfoEntity> findByDateTime(Timestamp timestamp);
}
