package com.wombats.jwt.controller;

import com.wombats.jwt.controller.dto.User;
import com.wombats.jwt.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/demo")
public class AutheticationController {

    private final JwtService jwtService;

    @PostMapping("/user")
    public User login(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
        return jwtService.login(username);
    }

}
