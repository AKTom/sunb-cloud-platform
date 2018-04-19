package com.sunb.platform.module.center;


import com.sunb.base.service.framework.annotation.CloudPlatformServiceApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients("com.sunb")
@ComponentScan(basePackages = "com.sunb")
@MapperScan("com.sunb.platform.module.center.dao")
@CloudPlatformServiceApplication
public class ModuleCenterApplication {
    public static void main(String [] args){
        SpringApplication.run(ModuleCenterApplication.class, args);
    }
}
