package com.javanauta.aprendendo_spring.infrastructure.exceptions;

public class ConflictException extends RuntimeException{

    public ConflictException(String mensagem) {
        super(mensagem);
    }

    public ConflictException(String message, Throwable cause) {
        super(message);
    }
}
