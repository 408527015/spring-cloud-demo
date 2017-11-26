package com.dreamyao.spring.cloud.common.pojo.service1;

import com.dreamyao.spring.cloud.common.pojo.BaseVO;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/27
 */
public class UserVO extends BaseVO {

    public String userID;

    public String userName;

    public String age;

    public String sex;

    public String email;

    public String phone;

    public String addr;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
