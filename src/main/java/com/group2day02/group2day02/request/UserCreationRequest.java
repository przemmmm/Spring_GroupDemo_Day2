package com.group2day02.group2day02.request;

public class UserCreationRequest {

    private String name;
    private String gender;
    private int seniority;
    public UserCreationRequest(String name, String gender, int seniority) {
        this.name = name;
        this.gender = gender;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getSeniority() {
        return seniority;
    }

    @Override
    public String toString() {
        return "UserCreationRequest{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", seniority=" + seniority +
                '}';
    }
}
