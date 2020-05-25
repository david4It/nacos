package com.david4it.consumer_feign.fallback;

import com.david4it.consumer_feign.feign.RemoteClient;
import org.springframework.stereotype.Component;

@Component
public class RemoteClientHystrix implements RemoteClient {
    @Override
    public String helloNacos() {
        return "请求超时";
    }
}
