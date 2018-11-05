package com.demo.firstcommon.client;

import com.demo.common.RestResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author fandongbo
 */
@FeignClient(value = "firstservice")
public interface FirstClient {

    @RequestMapping(value = "/firstservice/test1/", method = {RequestMethod.GET})
    RestResponse<String> test1();

    @RequestMapping(value = "/firstservice/test2/", method = {RequestMethod.GET})
    RestResponse<String> test2();

    @RequestMapping(value = "/firstservice/test3/{param}", method = {RequestMethod.GET})
    RestResponse<String> test3(@PathVariable(value = "param") String param);

}
