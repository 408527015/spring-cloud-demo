package com.dreamyao.spring.cloud.common.pojo;

import java.sql.Timestamp;

/**
 * @author BruceLong
 * @version 1.0.0
 * @date 2017/11/27
 */
public class BaseVO {

    public String createdBy;

    public Timestamp createdDate;

    public String createdDateStr;

    public String lastUpdatedBy;

    public Timestamp lastUpdatedDate;

    public String lastUpdatedDateStr;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedDateStr() {
        return createdDateStr;
    }

    public void setCreatedDateStr(String createdDateStr) {
        this.createdDateStr = createdDateStr;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Timestamp getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getLastUpdatedDateStr() {
        return lastUpdatedDateStr;
    }

    public void setLastUpdatedDateStr(String lastUpdatedDateStr) {
        this.lastUpdatedDateStr = lastUpdatedDateStr;
    }
}
