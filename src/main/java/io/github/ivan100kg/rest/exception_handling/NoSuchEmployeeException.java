package io.github.ivan100kg.rest.exception_handling;

public class NoSuchEmployeeException extends RuntimeException{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
