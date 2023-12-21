package com.solucion.solfinemesis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SolfiNemesisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolfiNemesisApplication.class, args);
    }

}
