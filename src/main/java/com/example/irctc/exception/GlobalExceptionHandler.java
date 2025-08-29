package com.example.irctc.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TrainBodyNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleTrainBodyNotFoundException(TrainBodyNotFoundException ex){
        ErrorResponse err = new ErrorResponse(
                HttpStatus.NOT_FOUND.value(),
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(err, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        StringBuilder message = new StringBuilder();
        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            message.append(fieldError.getField())
                    .append(": ")
                    .append(fieldError.getDefaultMessage())
                    .append(";");
        }
        ErrorResponse err = ErrorResponse.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message(message.toString())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }


    @ExceptionHandler(org.springframework.dao.DataIntegrityViolationException.class)
    public ResponseEntity<ErrorResponse> handleDataIntegrityViolationException(DataIntegrityViolationException ex){
        String message="Duplicate entry: The value you are trying to save already exists";

        ErrorResponse err= ErrorResponse.builder()
                .status(HttpStatus.CONFLICT.value())
                .message(message)
                .timestamp(LocalDateTime.now())
                .build();
        return new ResponseEntity<>(err, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse err = ErrorResponse.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .message("An unexpected error occurred. Please contact support. The Exception is : " +  ex.getClass().getName())
                .timestamp(LocalDateTime.now())
                .build();

        return new ResponseEntity<>(err, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
