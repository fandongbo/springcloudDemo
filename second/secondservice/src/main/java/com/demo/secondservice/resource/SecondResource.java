package com.demo.secondservice.resource;

import com.demo.common.Employee;
import com.demo.common.RestResponse;
import com.demo.common.RestResponseBuilder;
import com.demo.secondcommon.SecondClient;
import com.demo.secondservice.service.SecondService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandongbo
 */
@RestController
@Api(tags = "second-service-api", description = "second service demo")
public class SecondResource implements SecondClient {

    @Autowired
    private SecondService secondService;

    @Override
    @ApiOperation("test1")
    @RequestMapping(value = "/secondservice/test1/", method = {RequestMethod.GET})
    public RestResponse<String> test1() {
        return new RestResponseBuilder<String>().success(secondService.test1());
    }

    @Override
    @ApiOperation("test2")
    @RequestMapping(value = "/secondservice/test2/", method = {RequestMethod.GET})
    public RestResponse<String> test2() {
        return new RestResponseBuilder<String>().success(secondService.test2());
    }

    @Override
    @ApiOperation("test3")
    @RequestMapping(value = "/secondservice/test3/", method = {RequestMethod.GET})
    public RestResponse<String> test3() {
        return new RestResponseBuilder<String>().success(secondService.test3());
    }

    @Override
    @ApiOperation("test4")
    @RequestMapping(value = "/secondservice/test4", method = {RequestMethod.POST})
    public RestResponse<Employee> test4(@RequestBody Employee employee) {
        employee.setNumber(100);
        employee.setName("aaa");
        employee.setAge(24);
        return new RestResponseBuilder<Employee>().success(employee);
    }
}
