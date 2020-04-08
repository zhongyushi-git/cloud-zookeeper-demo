package com.zys.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient用于向consul或Zookeeper作为注册中心时注册服务

@SpringBootApplication
@EnableDiscoveryClient
public class ProviderMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderMain8001.class, args);
    }
}
