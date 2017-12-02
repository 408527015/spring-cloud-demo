package com.dreamyao.spring.cloud.service1.service;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.common.pojo.service1.ResourceVO;
import com.github.pagehelper.PageInfo;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/12/2
 */
public interface IResourceService {

    PageInfo<ResourceVO> findResourceList() throws ServiceException;
}
