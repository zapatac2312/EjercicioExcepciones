package com.example.demo.exceptions;

public class NullOrEmptyPokemonException extends RuntimeException{
    public NullOrEmptyPokemonException() {
    }

    public NullOrEmptyPokemonException(String message) {
        super(message);
    }

    public NullOrEmptyPokemonException(String message, Throwable cause) {
        super(message, cause);
    }
}
