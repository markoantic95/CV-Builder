/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cvbuilder.service;

import com.cvbuilder.dto.UserDTO;

import java.util.List;

/**
 *
 * @author Marko
 */
public interface UserService {
    
    public List<UserDTO> findAll();
    public UserDTO findById(Long id);
    public Object login(UserDTO user);
    public UserDTO register(UserDTO user);
    public Boolean existsByUsername(UserDTO user);
}
