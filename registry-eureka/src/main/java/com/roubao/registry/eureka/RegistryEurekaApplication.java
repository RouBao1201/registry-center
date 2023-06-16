package com.roubao.registry.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Eureka注册中心服务
 *
 * @author SongYanBin
 * @copyright ©2023-2099 SongYanBin. All rights reserved.
 * @since 2023/6/16
 **/
@SpringBootApplication
@EnableEurekaServer
public class RegistryEurekaApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RegistryEurekaApplication.class);
        app.run(args);
    }

    /**
     * eureka开启认证之后无法链接
     * security默认开启了csrf配置（需关闭后客户端才可以连接）
     */
    @EnableWebSecurity
    static class WebSecurityConfig extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.csrf().disable().authorizeRequests().anyRequest().authenticated().and().httpBasic();
        }
    }
}
