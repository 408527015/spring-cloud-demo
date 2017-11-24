package com.dreamyao.spring.cloud.common.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/25
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public String jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        //TODO
        return "";
    }

}
