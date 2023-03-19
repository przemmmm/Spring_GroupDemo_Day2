package com.group2day02.group2day02.repository;

import com.group2day02.group2day02.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <UserEntity, Long> {
}
