package com.demo.firstservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author fandongbo
 */
@Service
@RefreshScope
public class FirstService {

    @Value("${test.value1}")
    private String testValue;

    public String test1() {

        return "this is first service method test1";
    }


    public String test2() {
        return "this is first service method test2";
    }

    public String test3() {
        return "value of 'test.value1' in git configuration file is: " + testValue;
    }

}
