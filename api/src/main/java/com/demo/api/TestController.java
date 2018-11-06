package com.demo.api;

import com.demo.common.Employee;
import com.demo.common.RestResponse;
import com.demo.firstcommon.client.FirstClient;
import com.demo.secondcommon.SecondClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandongbo
 */
@RestController
@Api(tags = "demo-api", description = "demo api")
public class TestController {

    @Autowired
    private FirstClient firstClient;

    @Autowired
    private SecondClient secondClient;

    @ApiOperation("firstServiceTest1")
    @RequestMapping(value = "/firstservice/test1/", method = {RequestMethod.GET})
    public RestResponse<String> firstServiceTest1() {
        return firstClient.test1();
    }


    @ApiOperation("firstServiceTest2")
    @RequestMapping(value = "/firstservice/test2/", method = {RequestMethod.GET})
    public RestResponse<String> firstServiceTest2() {
        return firstClient.test2();
    }

    @ApiOperation("firstServiceTest3")
    @RequestMapping(value = "/firstservice/test3/{param}", method = {RequestMethod.GET})
    public RestResponse<String> firstServiceTest3(@PathVariable(value = "param") String param) {
        return firstClient.test3(param);
    }

    @ApiOperation("firstServiceTest4")
    @RequestMapping(value = "/firstservice/test4/", method = {RequestMethod.GET})
    public RestResponse<String> firstServiceTest4() {
        return firstClient.test4();
    }

    @ApiOperation("secondServiceTest1")
    @RequestMapping(value = "/secondservice/test1/", method = {RequestMethod.GET})
    public RestResponse<String> secondServiceTest1() {
        return secondClient.test1();
    }

    @ApiOperation("secondServiceTest2")
    @RequestMapping(value = "/secondservice/test2/", method = {RequestMethod.GET})
    public RestResponse<String> secondServiceTest2() {
        return secondClient.test2();
    }

    @ApiOperation("secondServiceTest3")
    @RequestMapping(value = "/secondservice/test3/", method = {RequestMethod.GET})
    public RestResponse<String> secondServiceTest3() {
        return secondClient.test3();
    }

    @ApiOperation("secondServiceTest4")
    @RequestMapping(value = "/secondservice/test4", method = {RequestMethod.POST})
    public RestResponse<Employee> secondServiceTest4(@RequestBody Employee employee) {
        return secondClient.test4(employee);
    }
}
