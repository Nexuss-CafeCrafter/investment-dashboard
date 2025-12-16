package com.nathanbonelli.invest.investment_dashboard_back.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanbonelli.invest.investment_dashboard_back.entity.Users;
import com.nathanbonelli.invest.investment_dashboard_back.repository.UsersRepository;

@Service
public class UsersService {
    @Autowired
    private UsersRepository userRepository;

    public Users saveUser(Users user) {
        return userRepository.save(user);
    }

    public Iterable<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Users getById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("Plural User has same ID"));
    }

    public Users getByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
