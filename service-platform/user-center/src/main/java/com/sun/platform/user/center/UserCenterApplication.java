package com.sun.platform.user.center;

import com.sudiyi.base.service.framework.annotation.CloudPlatformServiceApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients("com.sun")
@ComponentScan(basePackages = "com.sun")
@MapperScan("com.sun.platform.user.center.dao")
@CloudPlatformServiceApplication
public class UserCenterApplication {
    public static void main(String [] args){
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
