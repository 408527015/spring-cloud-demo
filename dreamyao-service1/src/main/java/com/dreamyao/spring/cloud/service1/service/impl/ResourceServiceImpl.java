package com.dreamyao.spring.cloud.service1.service.impl;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.common.pojo.service1.ResourceVO;
import com.dreamyao.spring.cloud.service1.dao.cluster.ResourceDAO;
import com.dreamyao.spring.cloud.service1.service.IResourceService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/12/2
 */
@Service
public class ResourceServiceImpl implements IResourceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResourceServiceImpl.class);

    @Autowired
    private ResourceDAO resourceDAO;

    @Override
    public PageInfo<ResourceVO> findResourceList() throws ServiceException {
        return new PageInfo<>(resourceDAO.findResourceList());
    }
}
