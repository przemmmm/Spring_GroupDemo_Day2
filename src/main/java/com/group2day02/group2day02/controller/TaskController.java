package com.group2day02.group2day02.controller;

import com.group2day02.group2day02.entity.TaskEntity;
import com.group2day02.group2day02.exception.TaskServiceException;
import com.group2day02.group2day02.request.TaskCreationRequest;
import com.group2day02.group2day02.request.TaskFilterRequest;
import com.group2day02.group2day02.response.TaskResponse;
import com.group2day02.group2day02.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TaskController {

    private TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/task")
    public String getTaskPage(Model model) {
        TaskCreationRequest taskCreationRequest = new TaskCreationRequest();
        model.addAttribute("request", taskCreationRequest);
        return "task-main-page";
    }

    @PostMapping("/task")
    public String addTask(@ModelAttribute("request") TaskCreationRequest taskCreationRequest,
                          Model model) {
        System.out.println(taskCreationRequest);
        try {
            taskService.addTask(taskCreationRequest);
            model.addAttribute("message", "zadanie o nazwie: " + taskCreationRequest.getName() + " zostało dodane");
        } catch (TaskServiceException e) {
            model.addAttribute("message", e.getMessage());
        }
        return "start-page";
    }

    @GetMapping("find-task")
    public String getFindTaskPage(Model model){
        model.addAttribute("request", new TaskFilterRequest());
        List<TaskResponse> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "find-task";
    }

    @PostMapping("find-task")
    public String filteredFindTaskPade(@ModelAttribute("request") TaskFilterRequest taskFilterRequest){
        System.out.println(taskFilterRequest);
        return "find-task";
    }

}