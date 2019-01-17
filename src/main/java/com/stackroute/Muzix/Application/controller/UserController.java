package com.stackroute.Muzix.Application.controller;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.exceptions.TrackNotFoundException;
import com.stackroute.Muzix.Application.exceptions.UserAlreadyExistException;
import com.stackroute.Muzix.Application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {
    UserService userService;

@Autowired
    public UserController(UserService userService) {

    this.userService = userService;
}
        @PostMapping("user")

        public ResponseEntity<?> saveUser(@RequestBody User user)
        {
            ResponseEntity responseEntity;
            try{
                userService.saveUser(user);
                responseEntity=new ResponseEntity<String>( "Created", HttpStatus.CREATED);
            }
            catch (UserAlreadyExistException exception){
                responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
            }
            return responseEntity;
        }

        @GetMapping("user")
        public ResponseEntity<?> getAllUser() {
            return new ResponseEntity<List<User>>(userService.getAllUsers(), HttpStatus.OK);
        }
        @PutMapping("user")
    public ResponseEntity<?> UpdateUser(@RequestBody User user){
            ResponseEntity responseEntity;
            try{
                userService.saveUser(user);
                responseEntity=new ResponseEntity<String>( "updated", HttpStatus.CREATED);
            }
            catch (UserAlreadyExistException exception){
                responseEntity=new ResponseEntity<String>(exception.getMessage(),HttpStatus.CONFLICT);
            }
            return responseEntity;

        }
        @DeleteMapping("user/{id}")
    public ResponseEntity<?> getDeleteUser( @PathVariable("id") int id) {
            ResponseEntity responseEntity;
            try {

                userService.deleteUser(id);
                responseEntity = new ResponseEntity<String>("delete", HttpStatus.CREATED);
            } catch (TrackNotFoundException e) {
                responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
            }
            return responseEntity;

        }
    }

