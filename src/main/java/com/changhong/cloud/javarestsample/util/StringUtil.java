package com.changhong.cloud.javarestsample.util;

import java.util.UUID;

/**
 * 描述:String工具类
 * 时间:2018-03-07 10:05
 *
 * @author:yjph83
 */
public class StringUtil {

    public static String UUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static boolean isEmpty(String str){
        return org.springframework.util.StringUtils.isEmpty(str);
    }

}
