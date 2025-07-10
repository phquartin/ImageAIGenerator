package dev.phquartin.springdockerfile.global.exception;

import dev.phquartin.springdockerfile.local.autor.validation.AutorException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class GlobalHandlerException {

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy | HH:mm:ss");

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleException(Exception exception, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), 500, LocalDateTime.now().format(formatter), request.getRequestURI());
        return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleEntityNotFoundException(EntityNotFoundException exception, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), 404, LocalDateTime.now().format(formatter), request.getRequestURI());
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AutorException.class)
    public ResponseEntity<ErrorResponse> handleAutorException(AutorException exception, HttpServletRequest request) {
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), 400, LocalDateTime.now().format(formatter), request.getRequestURI());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }


}
