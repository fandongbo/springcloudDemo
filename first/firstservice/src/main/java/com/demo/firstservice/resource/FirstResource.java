package com.demo.firstservice.resource;

import com.demo.common.RestResponse;
import com.demo.common.RestResponseBuilder;
import com.demo.firstcommon.client.FirstClient;
import com.demo.firstservice.service.FirstService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandongbo
 */
@RestController
@Api(tags = "first-service-api", description = "first service demo")
public class FirstResource implements FirstClient {

    @Autowired
    private FirstService firstService;

    @Override
    @ApiOperation("test1")
    @RequestMapping(value = "/firstservice/test1/", method = {RequestMethod.GET})
    public RestResponse<String> test1() {
        return new RestResponseBuilder<String>().success(firstService.test1());
    }

    @Override
    @ApiOperation("test2")
    @RequestMapping(value = "/firstservice/test2/", method = {RequestMethod.GET})
    public RestResponse<String> test2() {
        return new RestResponseBuilder<String>().success(firstService.test2());
    }

    @Override
    @ApiOperation("test3")
    @RequestMapping(value = "/firstservice/test3/{param}", method = {RequestMethod.GET})
    public RestResponse<String> test3(@PathVariable(value = "param") String param) {
        return new RestResponseBuilder<String>().success("this is first service method test3, param:" + param);
    }
}
