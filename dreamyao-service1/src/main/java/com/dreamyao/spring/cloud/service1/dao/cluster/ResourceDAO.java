package com.dreamyao.spring.cloud.service1.dao.cluster;

import com.dreamyao.spring.cloud.common.pojo.service1.ResourceVO;
import com.github.pagehelper.Page;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/12/2
 */
public interface ResourceDAO {

    Page<ResourceVO> findResourceList();
}
