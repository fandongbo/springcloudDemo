package com.demo.api;

import com.demo.firstcommon.client.FirstClient;
import com.demo.secondcommon.SecondClient;
import com.netflix.discovery.converters.Auto;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
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



}
