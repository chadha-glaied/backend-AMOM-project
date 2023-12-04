package com.amal.portabilite.service.impl;

import com.amal.portabilite.exception.UserFoundException;
import com.amal.portabilite.model.User;
import com.amal.portabilite.model.UserRole;
import com.amal.portabilite.repositories.RoleRepository;
import com.amal.portabilite.repositories.UserRepository;

import com.amal.portabilite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User userLocal = userRepository.findByUsername(user.getUsername());
        if(userLocal != null){
            System.out.println("user already exist");
            throw new UserFoundException("user is present");
        }
        else{
            for(UserRole userRole:userRoles){
                roleRepository.save(userRole.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            userLocal = userRepository.save(user);
        }
        return userLocal;
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}