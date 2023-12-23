package com.solucion.solfinemesis.service;

import com.solucion.solfinemesis.exception.UserPasswordWrongException;
import com.solucion.solfinemesis.exception.ValidateEmailFormatError;
import com.solucion.solfinemesis.mappers.UserMappers;
import com.solucion.solfinemesis.repository.UserRepository;
import com.solucion.solfinemesis.request.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        if (!validateEmailFormart(userRequest.getEmail())) {
            throw new ValidateEmailFormatError();
        }

        this.userRepository.save(UserMappers.userRequestToUserEntity(userRequest));
    }

    private Boolean validateEmailFormart(String email){
        String expresionRegular = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
