package com.dreamyao.spring.cloud.service1.service.impl;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.common.pojo.service1.UserVO;
import com.dreamyao.spring.cloud.service1.dao.master.UserDAO;
import com.dreamyao.spring.cloud.service1.service.IUserService;
import com.github.pagehelper.PageInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/11/25
 */
@Service
public class UserServiceImpl implements IUserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDAO userDAO;

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

    @Override
    public PageInfo<UserVO> findUserList() throws ServiceException {
        return new PageInfo<>(userDAO.findUserList());
    }
}
