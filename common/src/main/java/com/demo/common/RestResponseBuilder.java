package com.demo.common;

/**
 * 服务返回对象构造器
 * <p>
 * Created by fandongbo
 */
public class RestResponseBuilder<E> {
    private String status;
    private String errorCode;
    private String errorMsg;
    private E response;

    public RestResponseBuilder status(String status) {
        this.status = status;
        return this;
    }

    public RestResponseBuilder error(String code, String message) {
        this.errorCode = code;
        this.errorMsg = message;
        return this;
    }

    public RestResponseBuilder response(E response) {
        this.response = response;
        return this;
    }

    public RestResponse success(E response) {
        return new RestResponse(RestResponse.SUCCESS, RestResponse.SUCCESS_CODE, response);
    }

    public RestResponse fail(E response, String code, String message) {
        return new RestResponse(RestResponse.FAIL, code, message, response);
    }

    public RestResponse build() {
        return new RestResponse<>(this.status, this.errorCode, this.errorMsg, this.response);
    }
}
