package com.todo.msa.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by rochuan on 2017/6/5.
 */
@RestController
@RequestMapping(value = "/user")
public class BaseController
{
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/login")
    public Object login(@RequestParam Integer userId , @RequestParam String username , @RequestParam String mobile){
        String url = "http://MSA-USER-SERVICE/user/login?userId="+ userId +"&username="+username+"&mobile="+mobile;

        System.out.printf("url : "+ url);
        return restTemplate.getForEntity(url, String.class).getBody();

    }
}
