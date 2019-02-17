package com.showjoy.hairui.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.mybatis.spring.annotation.MapperScan;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @Author: hairui
 * @Date: 2019/2/17 10:25
 */

@Configuration
@MapperScan(basePackages = { "com.showjoy.hairui.dao" }, sqlSessionFactoryRef = "messageWriteSqlSessionFactory")
public class HaiRuiDataSourceConfig {
    @Autowired private Environment env;

    @Bean public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        return dataSource;
    }
}