package com.changhong.cloud.javarestsample.util;

/**
 * 描述:返回json实体对象
 * 时间:2018-03-06 14:00
 *
 * @author:yjph83
 */
public class ReturnJsonStr {

    /**
     * 代码（）
     */
    private String code = null;

    /**
     * 消息（消息提示）
     */
    private Object msg = null;

    /**
     * 数据（json格式）
     */
    private Object data = null;



    public ReturnJsonStr() {}

    /**
     * 封装REST API 返回参数
     * @param code 前端接口判断标志
     * @param msg 前端接口、后台页面均在使用的消息提示
     * @param data 前端接口、后台页面均在使用的数据
     */
    public ReturnJsonStr(String code, Object msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * <p>说明：获取代码</p>
     * <p>时间：2013-07-14 14:21:41</p>
     * @return 代码
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>说明：设置代码</p>
     * <p>时间：2018-03-06 14:02</p>
     * @param code
     * 			代码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>说明：获取消息</p>
     * <p>时间：2018-03-06 14:02</p>
     * @return 消息
     */
    public Object getMsg() {
        return msg;
    }

    /**
     * <p>说明：设置消息</p>
     * <p>时间：2018-03-06 14:02</p>
     * @param msg
     * 			消息
     */
    public void setMsg(Object msg) {
        this.msg = msg;
    }

    /**
     * <p>说明：获取数据</p>
     * <p>时间：2018-03-06 14:02</p>
     * @return 数据
     */
    public Object getData() {
        return data;
    }

    /**
     * <p>说明：设置数据</p>
     * <p>时间：2018-03-06 14:02</p>
     * @param data
     * 			数据
     */
    public void setData(Object data) {
        this.data = data;
    }
}
