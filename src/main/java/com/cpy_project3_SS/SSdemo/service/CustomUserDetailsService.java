package com.cpy_project3_SS.SSdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cpy_project3_SS.SSdemo.component.CustomUserDetails;
import com.cpy_project3_SS.SSdemo.entities.User;
import com.cpy_project3_SS.SSdemo.repositories.UserRepositotry;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    
    @Autowired
    private UserRepositotry userRepositotry;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepositotry.findByUsername(username);
        if(user == null)
            throw new UsernameNotFoundException("User not found");
            
        return new CustomUserDetails(user);
    }
    
}
