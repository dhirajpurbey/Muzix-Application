package com.stackroute.Muzix.Application.application;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.repository.UserRepository;
import com.stackroute.Muzix.Application.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Primary;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import com.stackroute.Muzix.Application.exceptions.UserAlreadyExistException;


@Component
@Data
@Primary
public class ApplicationContextListner implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    Environment env;
    @Autowired
    //UserService userService;
    UserRepository userRepository;
    User feedUserData = new User();

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        feedUserData.setTrackId(Integer.parseInt(env.getProperty("song.1.id")));
//        feedUserData.setTrackName(env.getProperty("song.1.name"));
//        feedUserData.setComments(env.getProperty("song.1.comment"));
//            userRepository.save(feedUserData);
//
//        feedUserData.setTrackId(Integer.parseInt(env.getProperty("song.2.id")));
//        feedUserData.setTrackName(env.getProperty("song.2.name"));
//        feedUserData.setComments(env.getProperty("song.2.comment"));
//            userRepository.save(feedUserData);
//
//        feedUserData.setTrackId(Integer.parseInt(env.getProperty("song.3.id")));
//        feedUserData.setTrackName(env.getProperty("song.3.name"));
//        feedUserData.setComments(env.getProperty("song.3.comment"));
//            userRepository.save(feedUserData);
    }
}