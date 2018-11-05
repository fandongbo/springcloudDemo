package com.demo.firstservice.service;

import org.springframework.stereotype.Service;

/**
 * @author fandongbo
 */
@Service
public class FirstService {

    public String test1() {

        return "this is first service method test1";
    }


    public String test2() {
        return "this is first service method test2";
    }

}
