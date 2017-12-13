package com.dreamyao.spring.cloud.service1.controller;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.common.pojo.service1.UserVO;
import com.dreamyao.spring.cloud.service1.service.IUserService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/10/27
 */
@RestController
@RequestMapping(value = "/user")
@Api
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public String getUserInfo() throws ServiceException {
        String user = userService.getUserInfo();
        LOGGER.info("user={}",user);
        return user;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public String addUser() throws ServiceException {
        String user = userService.addUser();
        LOGGER.info("user={}",user);
        return user;
    }

    @RequestMapping(value = "/findUserList", method = RequestMethod.GET)
    public PageInfo<UserVO> findUserList() throws ServiceException {
        return userService.findUserList();
    }
}
