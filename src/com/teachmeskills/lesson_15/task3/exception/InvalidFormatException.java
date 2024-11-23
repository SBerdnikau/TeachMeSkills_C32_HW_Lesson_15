package com.teachmeskills.lesson_15.task3.exception;

public class InvalidFormatException extends Exception {
    private int errorCode;
    public InvalidFormatException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
