package com.showjoy.hairui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @Author: hairui
 * @Date: 2019/2/17 10:15
 */
public class CurrentEnvironment implements EnvironmentAware {


    private Logger logger = LoggerFactory.getLogger(getClass());
    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        logger.info("CurrentEnvironment: {}", environment);
    }
}
