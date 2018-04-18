package com.sun.platform.module.center;

import com.sudiyi.base.service.framework.annotation.CloudPlatformServiceApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients("com.sun")
@ComponentScan(basePackages = "com.sun")
@MapperScan("com.sun.platform.module.center.dao")
@CloudPlatformServiceApplication
public class ModuleCenterApplication {
    public static void main(String [] args){
        SpringApplication.run(ModuleCenterApplication.class, args);
    }
}
