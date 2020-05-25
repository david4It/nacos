package com.david4it.consumer_feign.feign;

import com.david4it.consumer_feign.fallback.RemoteClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider", fallback = RemoteClientHystrix.class)
public interface RemoteClient {
    @GetMapping("/helloNacos")
    String helloNacos();
}
