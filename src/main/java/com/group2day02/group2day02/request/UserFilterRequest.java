package com.group2day02.group2day02.request;

public class UserFilterRequest {
    private String gender;

    public UserFilterRequest() {
    }

    public UserFilterRequest(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "UserFilterRequest{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
