package com.amal.portabilite.controller;

import com.amal.portabilite.configuration.JwtUtils;
import com.amal.portabilite.exception.UserNotFoundException;
import com.amal.portabilite.model.JwtRequest;
import com.amal.portabilite.model.JwtResponse;

import com.amal.portabilite.model.User;
import com.amal.portabilite.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@CrossOrigin("*")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/generate-token")
    public ResponseEntity<?> generateToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        try{
            autenticate(jwtRequest.getUsername(),jwtRequest.getPassword());
        }catch (UserNotFoundException exception){
            exception.printStackTrace();
            throw new Exception("User erroné");
        }

        UserDetails userDetails =  this.userDetailsService.loadUserByUsername(jwtRequest.getUsername());
        String token = this.jwtUtils.generateToken(userDetails);
        return ResponseEntity.ok(new JwtResponse(token));
    }

    private void autenticate(String username,String password) throws Exception {
        try{
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,password));
        }catch (DisabledException exception){
            throw  new Exception("USER ERROR " + exception.getMessage());
        }catch (BadCredentialsException e){
            throw  new Exception("Credencials invalid " + e.getMessage());
        }
    }

    @GetMapping("/actual-user")
    public User getUserActual(Principal principal){
        return (User) this.userDetailsService.loadUserByUsername(principal.getName());
    }
}
