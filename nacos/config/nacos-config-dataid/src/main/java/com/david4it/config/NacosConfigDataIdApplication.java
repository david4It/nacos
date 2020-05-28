package com.david4it.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigDataIdApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigDataIdApplication.class, args);
    }
}
