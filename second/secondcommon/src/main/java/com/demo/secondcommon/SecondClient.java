package com.demo.secondcommon;

import com.demo.common.Employee;
import com.demo.common.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fandongbo
 */
@FeignClient(value = "secondservice")
public interface SecondClient {

    @RequestMapping(value = "/secondservice/test1/", method = {RequestMethod.GET})
    RestResponse<String> test1();

    @RequestMapping(value = "/secondservice/test2/", method = {RequestMethod.GET})
    RestResponse<String> test2();

    @RequestMapping(value = "/secondservice/test3/", method = {RequestMethod.GET})
    RestResponse<String> test3();

    @RequestMapping(value = "/secondservice/test4", method = {RequestMethod.POST})
    RestResponse<Employee> test4(@RequestBody Employee employee);

}
