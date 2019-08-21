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
    private RestTemplate template;
    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    HelloRemote HelloRemote;

    @RequestMapping("/customer")
    public String index(){
        return template.getForEntity("http://localhost:9088/hello?name=chenping",String.class).getBody();
    }
    @RequestMapping("/customer2")
    public List<ServiceInstance> showinfo(){
         return this.discoveryClient.getInstances("eureka-provider");
    }
    @RequestMapping("/customer3/{name}")
    public String hello(@PathVariable("name") String name) {
        return HelloRemote.hello(name);
    }
}
