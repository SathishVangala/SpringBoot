package com.springcamp.Spring_boot_security.service;

import com.springcamp.Spring_boot_security.model.User;
import com.springcamp.Spring_boot_security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public User saveUser(User user){
        user.setPass(encoder.encode(user.getPass()));
        System.out.println(user.getPass());
        return repo.save(user);
    }
}
