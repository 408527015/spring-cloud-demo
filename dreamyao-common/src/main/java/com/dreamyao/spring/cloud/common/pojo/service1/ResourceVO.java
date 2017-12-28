package com.dreamyao.spring.cloud.common.pojo.service1;

import com.dreamyao.spring.cloud.common.pojo.BaseVO;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/12/2
 */
public class ResourceVO extends BaseVO {

    public String id;

    public String name;

    public String code;

    public String parentID;

    public Integer level;

    public Integer orderNum;

    public String enableFlag;

    public String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getParentID() {
        return parentID;
    }

    public void setParentID(String parentID) {
        this.parentID = parentID;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
