package com.liysh.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

//@Configuration
public class JdbcConfigThrid {
/**
    @Bean
    @ConfigurationProperties(prefix="jdbc")
    public DataSource dataSource(){
        return new DruidDataSource();

    }
*/
}
