package com.showjoy.hairui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.showjoy.dubbo.spring.ProviderAccessLogAspect;

@Configuration
public class AopConfig {
    @Bean
    public ProviderAccessLogAspect providerAccessLogAspect() {
        return new ProviderAccessLogAspect();
    }
}
