package com.sunb.platform.api.keeper;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 网关服务
 */
@Configuration
@EnableAutoConfiguration
@EnableZuulProxy
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.sun")
@SpringBootApplication
public class ApiKeeperApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiKeeperApplication.class, args);
	}

}
