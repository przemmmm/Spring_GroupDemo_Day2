package com.group2day02.group2day02.request;

public class UserCreationRequest {

    private String name;
    private String gender;

    public UserCreationRequest(String name, String gender) {
        this.name = name;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "UserCreationRequest{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
