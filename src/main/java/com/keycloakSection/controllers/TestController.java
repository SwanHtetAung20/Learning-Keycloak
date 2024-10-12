package com.keycloakSection.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("keycloak")
public class TestController {

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> hello(){
        return ResponseEntity.ok("This is Hello World from keycloak");
    }

    @GetMapping("/login")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> login(){
        return ResponseEntity.ok("This is Login World from keycloak");
    }
}
