package com.limanor44.springsecurityapp.repository;

import com.limanor44.springsecurityapp.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
