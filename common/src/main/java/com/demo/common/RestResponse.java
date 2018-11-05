package com.demo.common;

import com.alibaba.fastjson.JSON;

/**
 * 服务返回对象
 * status 请求状态，"SUCCESS" or "FAIL"
 * code 错误码，status为FAIL时有值
 * msg 错误信息，status为FAIL时有值
 * response 实际返回数据
 * Created by fandongbo
 */
public class RestResponse<T> {
    public static final String SUCCESS = "SUCCESS";
    public static final String FAIL = "FAIL";
    public static final String SUCCESS_CODE = "0000";
    private String status;
    private String code;
    private String msg;
    private T response;

    public RestResponse() {
    }

    public RestResponse(String status, String code, String msg, T response) {
        this.status = status;
        this.code = code;
        this.msg = msg;
        this.response = response;
    }

    public RestResponse(String status, String code, T response) {
        this.status = status;
        this.code = code;
        this.response = response;
    }

    public RestResponse(String status, T response) {
        this.status = status;
        this.response = response;
    }

    public boolean succeed() {
        return this.status.equals(SUCCESS);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
