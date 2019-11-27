/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.CVBuilder.service.impl;

import com.example.CVBuilder.dao.UserRepository;
import com.example.CVBuilder.dto.UserDTO;
import com.example.CVBuilder.entities.User;
import com.example.CVBuilder.exceptions.UserNotFoundException;
import com.example.CVBuilder.mapper.GenericMapper;
import com.example.CVBuilder.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Marko
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    GenericMapper mapper;
    @Autowired
    private UserRepository repository;

    public List<UserDTO> findAll() {
        List<User> users = repository.findAll();
        List<UserDTO> usersDTO = new ArrayList<>();
        for (User user : users) {
            usersDTO.add(mapper.userToUserDTO(user));
        }
        return usersDTO;
    }

    public UserDTO findById(Long id) {
        return mapper.userToUserDTO(repository.findById(id).get());
    }
    
    public Object login(UserDTO user){
        User userDB = repository.login(user.getUsername(), user.getPassword());
        return mapper.userToUserDTO(userDB);
    }
    
    public UserDTO register(UserDTO user) {
        User kor = mapper.userDTOToUser(user);
        return mapper.userToUserDTO(repository.save(kor));
    }
    
    public Boolean existsByUsername(UserDTO user){
        return repository.existsByUsername(user.getUsername());
    }
}
