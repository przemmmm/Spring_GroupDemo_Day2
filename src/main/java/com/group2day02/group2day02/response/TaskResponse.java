package com.group2day02.group2day02.response;

import java.util.Objects;

public class TaskResponse {

    private String title;
    private String type;
    private int level;
    private String name;

    public TaskResponse(String title, String type, int level, String name) {
        this.title = title;
        this.type = type;
        this.level = level;
        this.name = name;
    }

    public String getTitle() {
        return title;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskResponse that = (TaskResponse) o;
        return level == that.level && Objects.equals(title, that.title) && Objects.equals(type, that.type) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, type, level, name);
    }
}
