package com.evision.jobscheduler.controller;

import com.evision.jobscheduler.service.UserService;
import com.evision.jobscheduler.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class UserController {
    @Autowired
    public UserServiceImpl userService;


}
