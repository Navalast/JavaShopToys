package com.example.diplom.service;

import com.example.diplom.domain.User;
import com.example.diplom.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    boolean save(UserDTO userDTO);
    void save(User user);
    List<UserDTO> getAll();


    void updateProfile(UserDTO userDTO);

    User findByName(String name);

}
