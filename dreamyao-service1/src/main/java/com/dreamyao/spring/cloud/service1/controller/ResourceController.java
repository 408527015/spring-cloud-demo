package com.dreamyao.spring.cloud.service1.controller;

import com.dreamyao.spring.cloud.common.exception.ServiceException;
import com.dreamyao.spring.cloud.common.pojo.service1.ResourceVO;
import com.dreamyao.spring.cloud.service1.service.IResourceService;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/12/2
 */
@RestController
@RequestMapping(value = "/resource")
public class ResourceController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ResourceController.class);

    @Autowired
    private IResourceService resourceService;

    @RequestMapping(value = "/findResourceList", method = RequestMethod.GET)
    public PageInfo<ResourceVO> findResourceList() throws ServiceException {
        return resourceService.findResourceList();
    }

}
