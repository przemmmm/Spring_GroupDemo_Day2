package com.group2day02.group2day02.service;

import com.group2day02.group2day02.exception.UserServiceException;
import com.group2day02.group2day02.request.TaskCreationRequest;
import com.group2day02.group2day02.request.UserCreationRequest;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public void addTask(TaskCreationRequest taskCreationRequest) {
        if (taskCreationRequest.getTitle().isBlank()) {
            throw new UserServiceException("Nie podano tytułu zadania!");
        } else if (taskCreationRequest.getLevel() < 1) {
            throw new UserServiceException("Zadanie nie może być tak łatwe");
        }
        System.out.println("Wszystko ok, dodaję");
    }
}
