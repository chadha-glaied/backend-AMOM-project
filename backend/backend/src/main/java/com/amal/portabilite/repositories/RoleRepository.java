package com.amal.portabilite.repositories;


import com.amal.portabilite.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
