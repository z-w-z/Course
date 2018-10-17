package com.course.demo.Dao;

import com.course.demo.Entity.CoursePrivHistoryEntity;
import com.course.demo.Entity.CoursePrivHistoryEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CoursePrivHistoryDao extends JpaRepository<CoursePrivHistoryEntity,CoursePrivHistoryEntityPK> {
    List<CoursePrivHistoryEntity> findByUserIdAndOrderPrivId(int userId, int orderPrivId);
    void deleteByUserIdAndOrderPrivId(int userId,int orderPrivId);
}
