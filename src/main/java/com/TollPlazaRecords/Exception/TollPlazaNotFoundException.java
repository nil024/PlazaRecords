package com.TollPlazaRecords.Exception;

public class TollPlazaNotFoundException extends RuntimeException {
    private final int errorCode;

    public TollPlazaNotFoundException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}