package com.uk.javalon1.bart.springbootdbtwitter;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logout {

    @GetMapping("/bye")
    public void Logout() {

        SecurityContextHolder.clearContext();
        SecurityContextHolder.getContext().setAuthentication(null);
    }

}
