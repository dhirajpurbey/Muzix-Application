package com.stackroute.Muzix.Application.application;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@Data
@PropertySource("application.properties")
@Configuration
public class ApplicationCommandLineRunner implements CommandLineRunner {
    //  private final Logger logger = (Logger) LoggerFactory.getLogger(DataLoader.class);

    private User feedUserData = new User();

    @Value("${song.total}")
    private int totalSongs;
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
    Environment env;
    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) throws Exception {

//        System.out.println(env.getProperty("app.name"));
//        System.out.println(env.getProperty("JAVA_HOME"));
//        feedUserData.setTrackId(id1);
//        feedUserData.setTrackName(name1);
//        feedUserData.setComments(comment1);
//        userService.saveUser(feedUserData);
//
//        feedUserData.setTrackId(Integer.parseInt(env.getProperty("song.1.id")));
//        feedUserData.setTrackName(env.getProperty("song.1.name"));
//        feedUserData.setComments(env.getProperty("song.1.comment"));
//        userService.saveUser(feedUserData);
//
//        feedUserData.setTrackId(id2);
//        feedUserData.setTrackName(name2);
//        feedUserData.setComments(comment2);
//        userService.saveUser(feedUserData);
//
//        feedUserData.setTrackId(id3);
//        feedUserData.setTrackName(name3);
//        feedUserData.setComments(comment3);
//        userService.saveUser(feedUserData);
    }
}