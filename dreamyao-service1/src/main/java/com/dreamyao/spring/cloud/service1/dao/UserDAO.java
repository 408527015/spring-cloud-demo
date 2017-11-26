package com.dreamyao.spring.cloud.service1.dao;

import com.dreamyao.spring.cloud.common.pojo.service1.UserVO;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/27
 */
@Mapper
public interface UserDAO {
    UserVO findUserByID();

    Page<UserVO> findUserList();
}
