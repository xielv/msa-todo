package com.todo.msa.controller;

import com.todo.msa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rochuan on 2017/6/2.
 */
@RestController
public class UserController {

    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value = "/user/login")
    public String login(@RequestParam Integer userId , @RequestParam String username , @RequestParam String mobile){

        ServiceInstance instance = client.getLocalServiceInstance();


        User user = new User();
        user.setUserId(userId);
        user.setUsername(username);
        user.setMobile(mobile);

        System.out.printf("/add, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + user);
        return user.toString();
    }
}
