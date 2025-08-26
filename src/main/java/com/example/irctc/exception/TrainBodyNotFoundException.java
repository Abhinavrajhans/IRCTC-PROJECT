package com.example.irctc.exception;

public class TrainBodyNotFoundException extends RuntimeException{
    public TrainBodyNotFoundException(String message){
        super(message);
    }
}
