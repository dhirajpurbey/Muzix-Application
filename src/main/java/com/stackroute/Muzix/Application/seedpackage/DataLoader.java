//package com.stackroute.Muzix.Application.seedpackage;
//
//import com.stackroute.Muzix.Application.domain.User;
//import com.stackroute.Muzix.Application.repository.UserRepository;
//import com.stackroute.Muzix.Application.service.UserService;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//import java.util.logging.Logger;
//
//
//@Configuration
//public class DataLoader implements CommandLineRunner {
//  //  private final Logger logger = (Logger) LoggerFactory.getLogger(DataLoader.class);
//
//    private UserService userService;
//
//    @Autowired
//    public DataLoader(UserService userService) {
//        this.userService=userService;
//    }
//
//
//    @Override
//    public void run(String... args) throws Exception {
//
//     //   logger.info("Loading...");
//
//        userService.saveUser(new User(1,"apna time aaega","gully boy" ));
//        userService.saveUser(new User(2,"zero", "good one"));
//        userService.saveUser(new User(3,"awarapan hai yeh", "bad one"));
//
//    }
//}