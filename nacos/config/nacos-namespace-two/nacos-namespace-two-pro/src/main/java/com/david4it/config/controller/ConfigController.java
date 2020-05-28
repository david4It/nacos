package com.david4it.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {
    @Value("${nacos.config}")
    public String config;

    @RequestMapping("/config/value")
    public String getConfig(){
        return config;
    }
}
