package com.stackroute.Muzix.Application.service;

import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.domain.User;
import com.stackroute.Muzix.Application.exceptions.TrackNotFoundException;
import com.stackroute.Muzix.Application.exceptions.UpdateException;
import com.stackroute.Muzix.Application.exceptions.UserAlreadyExistException;

import java.util.List;

public interface UserService {

    public User saveUser(User user) throws  UserAlreadyExistException;
    public List<User> getAllUsers();

    public User updateUser(User user) throws UpdateException;
    public List<User> getUpdateUser() throws UpdateException;

    public boolean deleteUser(int id) throws TrackNotFoundException;
    //public List<User> getDeleteUser(int id);
}
