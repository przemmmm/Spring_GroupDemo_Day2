package com.group2day02.group2day02.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long taskId;
    private String name;
    private String gender;
    private int seniority;

    public UserEntity() {
    }

    public UserEntity(String name, String gender, int seniority) {
        this.name = name;
        this.gender = gender;
        this.seniority = seniority;
    }
}
