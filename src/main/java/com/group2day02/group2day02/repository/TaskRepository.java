package com.group2day02.group2day02.repository;

import com.group2day02.group2day02.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<TaskEntity, Long> {
}
