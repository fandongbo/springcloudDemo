package com.demo.secondservide.service;

import org.springframework.stereotype.Service;

/**
 * @author fandongbo
 */
@Service
public class SecondService {


    public String test1() {
        return "this is second service method test1";
    }

    public String test2() {
        return "this is second service method test2";
    }

}
