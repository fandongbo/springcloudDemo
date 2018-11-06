package com.demo.common;

import feign.Retryer;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fandongbo
 */
@Configuration
@EnableFeignClients(basePackages = {"com.demo.*"})
public class FeignClientConfiguration {
    
    @Autowired
    private ObjectFactory<HttpMessageConverters> messageConverters;
    
    @Bean
    public Encoder feignFormEncoder() {
        return new SpringFormEncoder(new SpringEncoder(messageConverters));
    }
    
    @Bean
    Retryer feignRetryer() {
        return Retryer.NEVER_RETRY;
    }
}
