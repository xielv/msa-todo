package com.todo.msa.controller.Impl;


import com.todo.msa.controller.UserControllerBase1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rochuan on 2017/6/5.
 */
@RestController
public class UserController
{

    @Autowired
    UserControllerBase1 userControllerBase1;

    @RequestMapping(value = "/user/login")
    public String login(@RequestParam Integer userId , @RequestParam String username , @RequestParam String mobile){
        return userControllerBase1.login(userId , username , mobile);

    }
}
