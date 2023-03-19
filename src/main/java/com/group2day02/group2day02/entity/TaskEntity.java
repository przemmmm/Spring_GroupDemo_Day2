package com.group2day02.group2day02.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;
    private String title;
    private String type;
    private int level;
    private String name;

    public TaskEntity() {
    }

    public TaskEntity(String title, String type, int level, String name) {
        this.title = title;
        this.type = type;
        this.level = level;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public Long getTaskId() {
        return taskId;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }
}
