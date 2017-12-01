package com.dreamyao.spring.cloud.common.util;

import java.util.UUID;

/**
 * @author Stone
 * @version 1.0.0
 * @date 2017/11/29
 */
public class UUIDHelper {

    public static String genUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(UUIDHelper.genUUID());
        }
    }

}
