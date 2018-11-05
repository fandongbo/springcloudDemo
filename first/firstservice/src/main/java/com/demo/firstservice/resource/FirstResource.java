package com.demo.firstservice.resource;

import com.demo.common.RestResponse;
import com.demo.common.RestResponseBuilder;
import com.demo.firstcommon.client.FirstClient;
import com.demo.firstservice.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandongbo
 */
@RestController
public class FirstResource implements FirstClient {

    @Autowired
    private FirstService firstService;

    @Override
    @RequestMapping(value = "/firstservice/test1/", method = {RequestMethod.GET})
    public RestResponse<String> test1() {
        return new RestResponseBuilder<String>().success(firstService.test1());
    }

    @Override
    @RequestMapping(value = "/firstservice/test2/", method = {RequestMethod.GET})
    public RestResponse<String> test2() {
        return new RestResponseBuilder<String>().success(firstService.test2());
    }

    @Override
    @RequestMapping(value = "/firstservice/test3/{param}", method = {RequestMethod.GET})
    public RestResponse<String> test3(@PathVariable(value = "param") String param) {
        return new RestResponseBuilder<String>().success("this is first service method test3, param:" + param);
    }
}
