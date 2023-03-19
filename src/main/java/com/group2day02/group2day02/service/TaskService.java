package com.group2day02.group2day02.service;

import com.group2day02.group2day02.entity.TaskEntity;
import com.group2day02.group2day02.exception.UserServiceException;
import com.group2day02.group2day02.repository.TaskRepository;
import com.group2day02.group2day02.request.TaskCreationRequest;
import com.group2day02.group2day02.request.UserCreationRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    @Transactional
    public void addTask(TaskCreationRequest taskCreationRequest) {
        if (taskCreationRequest.getTitle().isBlank()) {
            throw new UserServiceException("Nie podano tytułu zadania!");
        } else if (taskCreationRequest.getLevel() < 1) {
            throw new UserServiceException("Zadanie nie może być tak łatwe");
        }
        TaskEntity taskEntity = new TaskEntity(taskCreationRequest.getTitle(),
                taskCreationRequest.getType(),
                taskCreationRequest.getLevel(),
                taskCreationRequest.getName());
        taskRepository.save(taskEntity);
    }
}
