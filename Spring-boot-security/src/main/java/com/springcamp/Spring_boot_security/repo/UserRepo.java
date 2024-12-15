package com.springcamp.Spring_boot_security.repo;

import com.springcamp.Spring_boot_security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

    User findByUsername(String username);

}
