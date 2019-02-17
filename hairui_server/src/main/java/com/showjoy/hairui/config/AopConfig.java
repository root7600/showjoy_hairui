package com.showjoy.hairui.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: hairui
 * @Date: 2019/2/17 10:16
 */
@Configuration
public class AopConfig {

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @Bean
    public RestTemplate getRestTemplate(){
        RestTemplate build = restTemplateBuilder.build();
        return build;
    }
}
