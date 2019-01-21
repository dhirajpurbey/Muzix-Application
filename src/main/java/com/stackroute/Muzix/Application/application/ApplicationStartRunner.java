package com.stackroute.Muzix.Application.application;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartRunner implements ApplicationRunner {

    private User feedUserData = new User();

    /* @Value("${song.total}")
     private int totalSongs;*/
    @Value("${song.1.id}")
    private int id1;
    @Value("${song.1.name}")
    private String name1;
    @Value("${song.1.comment}")
    private String comment1;
    @Value("${song.2.id}")
    private int id2;
    @Value("${song.2.name}")
    private String name2;
    @Value("${song.2.comment}")
    private String comment2;
    @Value("${song.3.id}")
    private int id3;
    @Value("${song.3.name}")
    private String name3;
    @Value("${song.3.comment}")
    private String comment3;

    @Autowired
    private UserService userService;

    public ApplicationStartRunner(UserService userService) {
        this.userService=userService;
    }

    //TODO: Add all feeder data to a file, don't let it be hardcoded
    @Override
    public void run(ApplicationArguments args) throws Exception {
        feedUserData.setTrackId(id1);
        feedUserData.setTrackName(name1);
        feedUserData.setComments(comment1);
        userService.saveUser(feedUserData);

        feedUserData.setTrackId(id2);
        feedUserData.setTrackName(name2);
       feedUserData.setComments(comment2);
        userService.saveUser(feedUserData);

        feedUserData.setTrackId(id3);
        feedUserData.setTrackName(name3);
        feedUserData.setComments(comment3);
        userService.saveUser(feedUserData);

    }
}