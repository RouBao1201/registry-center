package com.roubao.registry.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

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
}
