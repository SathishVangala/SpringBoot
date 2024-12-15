package com.springcamp.Spring_boot_security.service;

import com.springcamp.Spring_boot_security.model.User;
import com.springcamp.Spring_boot_security.model.UserPrincipal;
import com.springcamp.Spring_boot_security.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class MyUserDetailsService implements UserDetailsService {

//    private int id;
//    private String username;
//    private String pass;
    @Autowired
   private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user= repo.findByUsername(username);
       if(user == null){
           System.out.println("User not found");
           throw new UsernameNotFoundException("User Not Found");
       }
        return new UserPrincipal(user);
    }
}
