package com.group2day02.group2day02.request;

public class TaskCreationRequest {
    private String title;
    private String type;
    private int level;
    private String name;

    public TaskCreationRequest() {
    }

    public TaskCreationRequest(String title, String type, int level, String name) {
        this.title = title;
        this.type = type;
        this.level = level;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TaskCreationRequest{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", level=" + level +
                ", name='" + name + '\'' +
                '}';
    }
}
