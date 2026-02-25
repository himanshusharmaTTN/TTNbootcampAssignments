package com.example.SpringSecurity.model;

import com.example.SpringSecurity.Repository.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepo repo;

    public CustomUserDetailService(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String email) {

        User user = repo.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("not found"));

        return new CustomUserDetail(user);
    }
}
