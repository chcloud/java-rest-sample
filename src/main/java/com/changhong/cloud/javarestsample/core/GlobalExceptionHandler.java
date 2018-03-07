package com.changhong.cloud.javarestsample.core;

import com.changhong.cloud.javarestsample.util.ReturnJsonStr;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述:
 * 时间:2018-03-06 14:40
 * @author yjph83
 */
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object exceptionHandler(HttpServletRequest req, Exception e){
        String requestURI = req.getRequestURI();
        ReturnJsonStr returnJsonStr = new ReturnJsonStr();
        returnJsonStr.setMsg(requestURI+" is error :"+e.getMessage());
        //TODO用常量代替最好
        returnJsonStr.setCode("4000");
        return returnJsonStr;
    }
}
