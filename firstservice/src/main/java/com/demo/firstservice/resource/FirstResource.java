package com.demo.firstservice.resource;

import com.demo.firstservice.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandongbo
 */
@RestController
public class FirstResource {

    @Autowired
    private FirstService firstService;
}
