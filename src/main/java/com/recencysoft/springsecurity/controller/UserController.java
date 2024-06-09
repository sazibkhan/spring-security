package com.recencysoft.springsecurity.controller;



import com.recencysoft.springsecurity.common.ResponseFactory;
import com.recencysoft.springsecurity.dto.RestResponse;
import com.recencysoft.springsecurity.dto.request.UserDTO;
import com.recencysoft.springsecurity.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public RestResponse saveUser(@RequestBody UserDTO userDTO ) {
        userService.saveUser(userDTO);
        return ResponseFactory.saveSuccess();
    }





}



