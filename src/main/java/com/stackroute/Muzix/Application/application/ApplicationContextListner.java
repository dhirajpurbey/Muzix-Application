package com.stackroute.Muzix.Application.application;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ApplicationContextListner implements ApplicationListener<ContextRefreshedEvent> {


    private UserService userService;

    @Autowired
    public ApplicationContextListner(UserService userService) {
        this.userService=userService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        try{
            userService.saveUser(new User("zero","good one"));
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}