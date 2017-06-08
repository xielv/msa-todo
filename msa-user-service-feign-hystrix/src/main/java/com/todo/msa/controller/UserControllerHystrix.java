package com.todo.msa.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rochuan on 2017/6/6.
 */
@Component
public class UserControllerHystrix implements UserControllerBase1 {
    @Override
    public String login(@RequestParam(value = "userId") Integer userId, @RequestParam(value = "username") String username, @RequestParam(value = "mobile") String mobile) {
        return "-9999";
    }
}
