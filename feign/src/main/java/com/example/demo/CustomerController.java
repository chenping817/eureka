package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by changzheng on 2019/8/20.
 */
@RestController
public class CustomerController {

    @Autowired
    HelloRemote helloRemote;
    @RequestMapping("/customer3")
    public String index( String name) {
        return helloRemote.index(name);
    }
}
