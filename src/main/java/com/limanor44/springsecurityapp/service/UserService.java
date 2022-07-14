package com.limanor44.springsecurityapp.service;

import com.limanor44.springsecurityapp.models.User;
import com.limanor44.springsecurityapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {


    private final UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Long id){
        return userRepository.getReferenceById(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public User removeUser(Long id){
        return userRepository.deleteById(id);
    }

}
