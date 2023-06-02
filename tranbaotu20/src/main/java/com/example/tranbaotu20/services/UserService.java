package com.example.tranbaotu20.services;


import com.example.tranbaotu20.entity.User;
import com.example.tranbaotu20.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;
    public void save(User user) {
        userRepository.save(user);
    }
}