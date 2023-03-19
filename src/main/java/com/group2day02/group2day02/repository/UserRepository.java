package com.group2day02.group2day02.repository;

import com.group2day02.group2day02.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <UserEntity, Long> {

    List<UserEntity> findByGender(String gender);
}
