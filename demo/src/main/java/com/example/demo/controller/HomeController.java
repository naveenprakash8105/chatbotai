package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TestResponse;

@RestController
public class HomeController {

	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
    @GetMapping("/test")
    public TestResponse home(@AuthenticationPrincipal OAuth2User principal,HttpServletRequest request, HttpServletResponse response) {
    	try {
    		if(principal instanceof DefaultOidcUser) {
    			DefaultOidcUser oiduser = (DefaultOidcUser) principal;
    			LOG.info("oiduser : "+oiduser);
    			String oid = oiduser.getAttribute("oid");
    			String email = oiduser.getClaimAsString("email");
    			String name = oiduser.getClaimAsString("name");
    			LOG.info("oid : "+oid);
    			LOG.info("name : "+name);
    			LOG.info("email : "+email);
    			
    		}
    	}catch(Exception e) {
    		LOG.error("HomeController Exception : "+e.getMessage(), e);
    	}
    	TestResponse res = new TestResponse();
    	res.setResponse("response");
        return res; // Create a home.html template
    }
}
