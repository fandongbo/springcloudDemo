package com.demo.secondservice;

import com.demo.common.FeignClientConfiguration;
import com.demo.common.RestTemplateConfig;
import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Import(value = {RestTemplateConfig.class, FeignClientConfiguration.class})
public class SecondserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondserviceApplication.class, args);
    }

    @Bean
    public Docket baseServiceApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .groupName("sevice-api")
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
            .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Service APIs")
            .description("服务接口").version("1.0").build();
    }
}
