package com.dynaring;

/**
 * Created by hjj
 */
public class MisMatchException extends RuntimeException {

    public MisMatchException() {
    }

    public MisMatchException(String detailMessage) {
        super(detailMessage);
    }

    public MisMatchException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }
}
