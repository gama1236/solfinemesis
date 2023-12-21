package com.solucion.solfinemesis.service;

import com.solucion.solfinemesis.exception.UserPasswordWrongException;
import com.solucion.solfinemesis.mappers.UserMappers;
import com.solucion.solfinemesis.repository.UserRepository;
import com.solucion.solfinemesis.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    UserServiceImpl(UserRepository userRepository){
        this.userRepository =  userRepository ;
    }

    @Override
    public void createUser(UserRequest userRequest) {

        if (!userRequest.getPassword().equalsIgnoreCase(userRequest.getConfirmPassword())) {
            throw new UserPasswordWrongException();
        }

        this.userRepository.save(UserMappers.userRequestToUserEntity(userRequest));
    }
}
