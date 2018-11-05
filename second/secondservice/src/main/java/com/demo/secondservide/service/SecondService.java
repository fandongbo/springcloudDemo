package com.demo.secondservide.service;

import com.demo.common.RestResponse;
import com.demo.firstcommon.client.FirstClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fandongbo
 */
@Service
public class SecondService {

    @Autowired
    private FirstClient firstClient;

    public String test1() {
        return "this is second service method test1";
    }

    public String test2() {
        return "this is second service method test2";
    }

    public String test3() {
        String str = firstClient.test1().getResponse();
        return "second service request first service, and the return is:" + str;
    }

}
