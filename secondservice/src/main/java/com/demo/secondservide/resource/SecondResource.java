package com.demo.secondservide.resource;

import com.demo.secondservide.service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fandongbo
 */
@RestController
public class SecondResource {

    @Autowired
    private SecondService secondService;

}
