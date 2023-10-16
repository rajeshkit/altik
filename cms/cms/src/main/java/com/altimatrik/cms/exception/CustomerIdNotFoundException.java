package com.altimatrik.cms.exception;

public class CustomerIdNotFoundException extends Exception{
    String message;

    public CustomerIdNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
