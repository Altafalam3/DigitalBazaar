package com.digitalBazaar.controllers;

import com.digitalBazaar.entities.User;
import com.digitalBazaar.payload.SingIn;
import com.digitalBazaar.payload.UserDto;
import com.digitalBazaar.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/singup")
    public ResponseEntity<UserDto> CreateUser(@RequestBody UserDto userDto){

        UserDto userDto1 = this.userService.CreateUser(userDto);

        return new ResponseEntity<>(userDto1, HttpStatusCode.valueOf(200));
    }


    @PostMapping("/singin")
    public ResponseEntity<SingIn> CreateUser(@RequestBody SingIn singIn){

        SingIn singIn1 = this.userService.SingIn(singIn);
        return new ResponseEntity<>(singIn1, HttpStatusCode.valueOf(200));
    }
}