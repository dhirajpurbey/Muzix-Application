package com.stackroute.Muzix.Application.exceptions;

public class TrackNotFoundException extends Exception {
    private String message;
    public TrackNotFoundException(){}

    public TrackNotFoundException(String tracknotfound){
        super(tracknotfound);
        this.message=tracknotfound;
    }
}
