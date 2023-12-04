package com.amal.portabilite.service;

import com.amal.portabilite.model.User;
import com.amal.portabilite.model.UserRole;


import java.util.Set;

public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public void deleteUser(Long userId);
}
