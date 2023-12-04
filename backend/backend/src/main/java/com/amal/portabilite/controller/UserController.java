package com.amal.portabilite.controller;

import com.amal.portabilite.model.Role;
import com.amal.portabilite.model.User;
import com.amal.portabilite.model.UserRole;

import com.amal.portabilite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/users")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception{
        user.setProfil("default.png");

        user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));

        Set<UserRole> userRoles = new HashSet<>();

        Role role = new Role();
        role.setRoleId(2L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        userRoles.add(userRole);
        return userService.createUser(user,userRoles);
    }


    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username){
        return userService.getUser(username);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
    }

}
