package com.dreamyao.spring.cloud.service1.dao.master;

import com.dreamyao.spring.cloud.common.pojo.service1.UserVO;
import com.github.pagehelper.Page;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/27
 */
//@Mapper
//@Repository
public interface UserDAO {
    UserVO findUserByID(String id);

    Page<UserVO> findUserList();
}
