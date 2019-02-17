package com.showjoy.hairui;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: hairui
 * @Date: 2019/2/17 10:06
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HaiRuiApplication {

    private static Logger logger = LoggerFactory.getLogger(HaiRuiApplication.class);


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(HaiRuiApplication.class).profiles("dev")
                .build(args).run(args);
    }
}
