package com.changhong.cloud.javarestsample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * 描述:实现简单的字符串倒序逻辑。
 * 时间:2018-03-05 17:25
 * @author yjph83
 */
@RestController
public class TestController {
    protected static Logger logger= LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/test",produces = "application/text;charset=utf-8", method = RequestMethod.POST)
    public String test(@RequestParam("input") String input)
    {
        logger.info(input);
        return new StringBuffer(input).reverse().toString();
    }
}
