package com.group2day02.group2day02.repository;

import com.group2day02.group2day02.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
