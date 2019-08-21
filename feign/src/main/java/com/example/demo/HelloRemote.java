package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by changzheng on 2019/8/20.
 */
@FeignClient(value="eureka-provider")
public interface HelloRemote {
    @RequestMapping("/hello")
    public String index( String name);
}
