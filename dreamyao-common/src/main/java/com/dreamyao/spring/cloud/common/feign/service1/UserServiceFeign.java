package com.dreamyao.spring.cloud.common.feign.service1;

import com.dreamyao.spring.cloud.common.pojo.service1.UserVO;
import com.github.pagehelper.PageInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/11/25
 */
@FeignClient("service1")
public interface UserServiceFeign {

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    String getUserInfo();

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    String addUser();

    @RequestMapping(value = "/findUserList", method = RequestMethod.GET)
    PageInfo<UserVO> findUserList();
}
