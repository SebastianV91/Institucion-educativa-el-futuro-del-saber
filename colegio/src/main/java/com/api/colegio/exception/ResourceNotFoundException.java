package com.api.colegio.exception;

public class ResourceNotFoundException extends RuntimeException {

    private String message;

    public ResourceNotFoundException(String message){
        super(message);
        this.message = message;

    }

}