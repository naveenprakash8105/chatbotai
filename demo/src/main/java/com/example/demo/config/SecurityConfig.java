package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig {

    
    
    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
            .requestMatchers()
                .antMatchers("/test", "/oauth2/**", "/login/**").and().authorizeRequests().anyRequest()
                .authenticated()
                .and()
                .oauth2Login();
        
        return http.build();
    }
}
