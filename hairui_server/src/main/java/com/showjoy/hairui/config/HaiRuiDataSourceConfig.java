package com.showjoy.hairui.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @Author: hairui
 * @Date: 2019/2/17 10:25
 */

@Configuration
@MapperScan(basePackages = {"com.showjoy.hairui.dao"}, sqlSessionFactoryRef = "shopSqlSessionFactory")
public class HaiRuiDataSourceConfig {
    @Autowired private Environment env;

    @Bean(name = "hairuiDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource initDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "hairuiTransactionManager")
    @Primary
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "shopSqlSessionFactory")
    @Primary
    public SqlSessionFactory initSqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(env.getProperty("mybatis.hairui.mapper-locations")));
        return sessionFactory.getObject();
    }
}