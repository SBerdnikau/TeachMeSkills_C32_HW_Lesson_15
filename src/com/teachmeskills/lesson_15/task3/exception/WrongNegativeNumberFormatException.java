package com.teachmeskills.lesson_15.task3.exception;

public class WrongNegativeNumberFormatException extends Exception {
    private int errorCode;

    public WrongNegativeNumberFormatException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
