package com.dreamyao.spring.cloud.service1.service;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.common.pojo.service1.UserVO;
import com.github.pagehelper.PageInfo;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/25
 */
public interface IUserService {
    String getUserInfo() throws ServiceException;

    String addUser() throws ServiceException;

    PageInfo<UserVO> findUserList() throws ServiceException;
}
