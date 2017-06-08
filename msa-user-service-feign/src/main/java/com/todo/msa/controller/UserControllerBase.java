package com.todo.msa.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rochuan on 2017/6/5.
 */
@FeignClient("msa-user-service")
public interface UserControllerBase {

    @RequestMapping(value = "/user/login")
    String login(@RequestParam(value = "userId") Integer userId , @RequestParam(value = "username") String username , @RequestParam(value = "mobile") String mobile);
}
