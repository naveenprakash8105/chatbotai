package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestResponse;

@RestController
public class HomeController {

    @GetMapping("/test")
    public TestResponse home(@AuthenticationPrincipal OAuth2User principal,HttpServletRequest request, HttpServletResponse response) {
    	TestResponse res = new TestResponse();
    	res.setResponse("response");
        return res; // Create a home.html template
    }
}
