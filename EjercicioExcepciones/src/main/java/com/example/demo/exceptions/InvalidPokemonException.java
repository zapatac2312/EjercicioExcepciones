package com.example.demo.exceptions;

public class InvalidPokemonException extends RuntimeException{
    public InvalidPokemonException() {
    }

    public InvalidPokemonException(String message) {
        super(message);
    }

    public InvalidPokemonException(String message, Throwable cause) {
        super(message, cause);
    }
}
