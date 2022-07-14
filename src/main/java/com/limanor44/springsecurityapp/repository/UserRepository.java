package com.limanor44.springsecurityapp.repository;

import com.limanor44.springsecurityapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();
    User getOne(Long id);
}
