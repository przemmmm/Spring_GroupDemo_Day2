package com.group2day02.group2day02.request;

public class TaskFilterRequest {
    private int level;

    public TaskFilterRequest() {
    }

    public TaskFilterRequest(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "TaskFilterRequest{" +
                "level=" + level +
                '}';
    }
}
