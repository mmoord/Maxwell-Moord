package com.maxwell.website.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.maxwell.website.util.web.dto.UserInitializer;


@RestController
@CrossOrigin
public class UserServlet {



    @PutMapping("/")
    public ResponseEntity<User> mainMenu(@RequestBody UserInitializer initUser){
        String test = "This is a test";
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/error")
    public ResponseEntity<User> errorMenu(){
        String test = "This is a test";
        return new ResponseEntity<>(HttpStatus.valueOf("Test"));
    }





}
