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
public class SolfinemsisControllerAdvicer extends ResponseEntityExceptionHandler {

    public static final String PASSWORD_NO_SAME = "The password is not same with the confirm password";
    public static final String EMAIL_NO_VALID = "The email have wrong format";

    /**
     *  Método que permite manejar la excepción contraseñas diferentes
     * @return ResponseEntity<UsuarioPrestamoExceptionResponse>
     */
    @ExceptionHandler(UserPasswordWrongException.class)
    public ResponseEntity<MessageExceptionResponse> notFoundException() {
        MessageExceptionResponse response = MessageExceptionResponse.builder()
                .message(PASSWORD_NO_SAME)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    /**
     * Método que permite manejar la excepción del formato del correo
     * @return
     */
    @ExceptionHandler(ValidateEmailFormatError.class)
    public ResponseEntity<MessageExceptionResponse> formaEmailException() {
        MessageExceptionResponse response = MessageExceptionResponse.builder()
                .message(EMAIL_NO_VALID)
                .build();
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

}
