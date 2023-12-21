package com.solucion.solfinemesis.controller;

import com.solucion.solfinemesis.responses.NationalityResponse;
import com.solucion.solfinemesis.service.NationalityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/nacionalities")
public class NationalityController {

    private final NationalityService nationalityService;

    @Autowired
    NationalityController(
            NationalityService nationalityService
    ){
        this.nationalityService = nationalityService;
    }

    @GetMapping
    public ResponseEntity<List<NationalityResponse>> getAllNacionalities() {
        List<NationalityResponse> nationalityResponse = nationalityService.getAllNationalities();

        return new ResponseEntity<>(nationalityResponse, HttpStatus.OK);
    }
}
