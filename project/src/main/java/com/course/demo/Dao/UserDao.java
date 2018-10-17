package com.course.demo.Dao;

import com.course.demo.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<UserEntity,Integer> {
    UserEntity findById(int id);
    UserEntity findByPhone(String phone);

    List<UserEntity> findByVip(int vip);
}
