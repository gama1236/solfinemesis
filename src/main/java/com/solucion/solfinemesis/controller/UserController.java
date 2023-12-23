package com.solucion.solfinemesis.controller;

import com.solucion.solfinemesis.request.UserRequest;
import com.solucion.solfinemesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/create-user")
public class UserController {

    private static final String SUCCESS_MESSAGE = "Registry created successfully";

    private final UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> getAllNacionalities(@RequestBody UserRequest userRequest) {

        this.userService.createUser(userRequest);
        return new ResponseEntity<>(SUCCESS_MESSAGE, HttpStatus.OK);
    }
}
