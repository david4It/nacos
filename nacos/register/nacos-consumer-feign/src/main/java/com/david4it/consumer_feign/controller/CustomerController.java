package com.david4it.consumer_feign.controller;

import com.david4it.consumer_feign.feign.RemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    public RemoteClient remoteClient;

    @GetMapping("/consumer/feign")
    public String consumer_feign() {
        return remoteClient.helloNacos();
    }
}
