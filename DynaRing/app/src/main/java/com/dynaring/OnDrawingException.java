package com.dynaring;

/**
 * Created by hjj
 */
public class OnDrawingException extends Exception {

    private static final String errorMsg = "正在绘制";

    public OnDrawingException() {
        this(errorMsg);
    }

    public OnDrawingException(String detailMessage) {
        this(detailMessage, null);
    }

    public OnDrawingException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

}
