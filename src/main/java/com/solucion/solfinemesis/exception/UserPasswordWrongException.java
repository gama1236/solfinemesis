package com.solucion.solfinemesis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Clase que representa la excepción de usuario que ya tiene un libro prestado
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class UserPasswordWrongException extends RuntimeException{

    public UserPasswordWrongException() {
        super();
    }

}
