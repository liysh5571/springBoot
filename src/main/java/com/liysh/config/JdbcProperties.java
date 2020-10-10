package com.liysh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationPropertie从application配置文件中读取配置项
 * prefix表示配置项的前缀jdbc.username
 * 配置项类中的类变量名笔试要与前缀之后的配置项名称报纸松散绑定
 */
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
