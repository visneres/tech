package com.inbev.tech.exceptions;

public class CustomNotFoundException extends RuntimeException{

    public CustomNotFoundException(String message){
        super(message);
    }
}