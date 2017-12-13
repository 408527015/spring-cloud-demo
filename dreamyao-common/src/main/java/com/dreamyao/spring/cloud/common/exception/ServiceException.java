package com.dreamyao.spring.cloud.common.exception;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/11/24
 */
public class ServiceException extends BaseException {

    public ServiceException(String message, int status) {
        super(message);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
