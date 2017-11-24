package com.dreamyao.spring.cloud.service1.service.impl;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.service1.service.IUserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/25
 */
@Service
public class UserService implements IUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @HystrixCommand(fallbackMethod = "fallback")
    @Override
    public String getUserInfo() throws ServiceException {
//        try {
//            Thread.sleep(5000L);
//        } catch (InterruptedException e) {
//            LOGGER.error("error:{}",e);
//            throw new ServiceException("UserService.error.1001",e);
//        }
        return "zhangsan";
    }

    @Override
    public String addUser() throws ServiceException {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            LOGGER.error("error:{}", e);
            throw new ServiceException("UserService.error.1001", e);
        }
        return "add success2";
    }

    public String fallback() {
        return "fallback";
    }
}