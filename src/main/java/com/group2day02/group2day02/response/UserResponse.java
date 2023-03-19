package com.group2day02.group2day02.response;

public class UserResponse {
    private String name;
    private String gender;
    private int seniority;

    public UserResponse(String name, String gender, int seniority) {
        this.name = name;
        this.gender = gender;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}
