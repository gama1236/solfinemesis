package com.solucion.solfinemesis.exception;


import com.solucion.solfinemesis.responses.MessageExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Clase que representa el controlador de excepciones
 */
@ControllerAdvice
public class solfinemsisControllerAdvicer extends ResponseEntityExceptionHandler {

    public static final String EMAIL_NO_VALID = "The password is no same with the confirm password";

    /**
     *  Método que permite manejar la excepción contraseñas diferentes
     * @return ResponseEntity<UsuarioPrestamoExceptionResponse>
     */
    @ExceptionHandler(UserPasswordWrongException.class)
    public ResponseEntity<MessageExceptionResponse> notFoundException() {
        MessageExceptionResponse response = MessageExceptionResponse.builder()
                .message(EMAIL_NO_VALID)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
