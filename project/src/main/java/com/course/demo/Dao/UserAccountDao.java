package com.course.demo.Dao;

import com.course.demo.Entity.UserAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAccountDao extends JpaRepository<UserAccountEntity,Integer> {
}
