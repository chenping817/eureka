package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by changzheng on 2019/8/21.
 */
@RestController
@RefreshScope
public class HelloController {
    @Value("${neo.hello}")
    private String hello;
    @RequestMapping("/hello")
    public String from(){
        return this.hello;

    }
}
