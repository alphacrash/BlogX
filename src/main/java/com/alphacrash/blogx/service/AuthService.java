package com.alphacrash.blogx.service;

import com.alphacrash.blogx.dto.RegisterRequest;
import com.alphacrash.blogx.model.User;
import com.alphacrash.blogx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
