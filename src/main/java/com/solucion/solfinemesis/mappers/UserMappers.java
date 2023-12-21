package com.solucion.solfinemesis.mappers;

import com.solucion.solfinemesis.entitys.UsersEntity;
import com.solucion.solfinemesis.repository.UserRepository;
import com.solucion.solfinemesis.request.UserRequest;

public class UserMappers {

    public static UsersEntity userRequestToUserEntity(UserRequest userRequest){
        return UsersEntity.builder()
                .email(userRequest.getEmail())
                .password(userRequest.getPassword().getBytes())
                .build();
    }
}
