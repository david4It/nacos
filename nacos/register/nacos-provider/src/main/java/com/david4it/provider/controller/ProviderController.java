package com.david4it.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController {

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }
}
