package com.amal.portabilite.repositories;

import com.amal.portabilite.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    public User findByUsername(String username);

}
