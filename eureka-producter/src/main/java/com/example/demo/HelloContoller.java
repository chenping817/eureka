package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by changzheng on 2019/8/20.
 */
@RestController
public class HelloContoller {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String index(@RequestParam(value = "name")String name){
        return "hello "+name+"，I`m service2 from port: "+port;
    }
}
