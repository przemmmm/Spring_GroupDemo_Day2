package com.group2day02.group2day02.service;

import com.group2day02.group2day02.exception.UserServiceException;
import com.group2day02.group2day02.request.UserCreationRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public void createUser(UserCreationRequest userCreationRequestequest) {
        if (userCreationRequestequest.getName().isBlank()) {
            throw new UserServiceException("Nie uzupełniono nazwy!");
        } else if (userCreationRequestequest.getSeniority() < 0) {
            throw new UserServiceException("Staż prcy nie może być ujemny!");
        }
        System.out.println("Wszystko ok, dodaję");
    }
}
