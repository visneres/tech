package com.inbev.tech.exceptions.example.exceptions;

public class CustomNotFoundException extends RuntimeException{

    public CustomNotFoundException(String message){
        super(message);
    }
}