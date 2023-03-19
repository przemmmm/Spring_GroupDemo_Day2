package com.group2day02.group2day02.service;

import com.group2day02.group2day02.entity.UserEntity;
import com.group2day02.group2day02.exception.UserServiceException;
import com.group2day02.group2day02.repository.UserRepository;
import com.group2day02.group2day02.request.UserCreationRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public void createUser(UserCreationRequest userCreationRequestequest) {
        if (userCreationRequestequest.getName().isBlank()) {
            throw new UserServiceException("Nie uzupełniono nazwy!");
        } else if (userCreationRequestequest.getSeniority() < 0) {
            throw new UserServiceException("Staż pracy nie może być ujemny!");
        }
        UserEntity userEntity = new UserEntity(userCreationRequestequest.getName(),
                userCreationRequestequest.getGender(),
                userCreationRequestequest.getSeniority());
        userRepository.save(userEntity);
    }
}
