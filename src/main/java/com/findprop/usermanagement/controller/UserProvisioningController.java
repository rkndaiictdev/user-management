package com.findprop.usermanagement.controller;

import com.findprop.domain.User;
import com.findprop.sample.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-management")
public class UserProvisioningController extends BaseController {

    private static Logger logger = LoggerFactory.getLogger(UserProvisioningController.class);

    @RequestMapping("/add-user")
    public String addUser(User user) {
        return "Hello World!";
    }

}
