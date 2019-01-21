package com.stackroute.Muzix.Application.domain;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Document(collection = "User")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(notes = "The database generated track Id")
    private  int trackId;
    @ApiModelProperty(notes = "Name of track")
    private String trackName;
    @ApiModelProperty(notes = "Comment of track")
    private String comments;
    public User(String trackName, String comments) {
        this.trackName = trackName;
        this.comments = comments;
    }
}