package com.TollPlazaRecords.Exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TollPlazaNotFoundException.class)
    public ResponseEntity<Object> handleTollPlazaNotFoundException(TollPlazaNotFoundException ex) {
        return ResponseEntity
                .status(404)
                .body(new ErrorResponse(ex.getErrorCode(), ex.getMessage()));
    }

    static class ErrorResponse {
        private final int errorCode;
        private final String message;

        public ErrorResponse(int errorCode, String message) {
            this.errorCode = errorCode;
            this.message = message;
        }

        public int getErrorCode() {
            return errorCode;
        }

        public String getMessage() {
            return message;
        }
    }
}
