package com.group2day02.group2day02.repository;

import com.group2day02.group2day02.entity.TaskEntity;
import com.group2day02.group2day02.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {

    List<UserEntity> findTopByLevel(int level);
}
