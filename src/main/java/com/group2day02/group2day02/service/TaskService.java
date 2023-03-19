package com.group2day02.group2day02.service;

import com.group2day02.group2day02.entity.TaskEntity;
import com.group2day02.group2day02.exception.UserServiceException;
import com.group2day02.group2day02.repository.TaskRepository;
import com.group2day02.group2day02.request.TaskCreationRequest;
import com.group2day02.group2day02.request.TaskFilterRequest;
import com.group2day02.group2day02.request.UserFilterRequest;
import com.group2day02.group2day02.response.TaskResponse;
import com.group2day02.group2day02.response.UserResponse;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TaskService {

    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

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

    public List<TaskResponse> getAllTasks(){
        return taskRepository.findAll().stream()
                .map(taskEntity -> new TaskResponse(taskEntity.getTitle(), taskEntity.getType(), taskEntity.getLevel(), taskEntity.getName()))
                .toList();
    }

    public List<TaskResponse> getTask(TaskFilterRequest taskFilterRequest){
        return taskRepository.findTopByLevel(taskFilterRequest.getLevel()).stream()
                .map(taskEntity-> new TaskResponse(taskEntity.))
    }

}
