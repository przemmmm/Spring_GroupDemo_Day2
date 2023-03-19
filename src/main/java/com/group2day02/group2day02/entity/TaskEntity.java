package com.group2day02.group2day02.entity;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

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
}
