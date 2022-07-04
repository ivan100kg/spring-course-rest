package io.github.ivan100kg.rest.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<EmployeeWrongId> handleException(NoSuchEmployeeException exception) {
        EmployeeWrongId wrongId = new EmployeeWrongId();
        wrongId.setInfo(exception.getMessage());
        return new ResponseEntity<>(wrongId, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<EmployeeWrongId> handleException(Exception exception) {
        EmployeeWrongId wrongId = new EmployeeWrongId();
        wrongId.setInfo(exception.getMessage());
        return new ResponseEntity<>(wrongId, HttpStatus.BAD_REQUEST);
    }
}
