package com.recencysoft.springsecurity.service;

import com.recencysoft.springsecurity.dto.request.UserDTO;
import com.recencysoft.springsecurity.entity.UserEntity;
import com.recencysoft.springsecurity.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final EntityValidationService entityValidationService;


    public void saveUser(UserDTO userDTO) {
        var user=new UserEntity();
        BeanUtils.copyProperties(userDTO,user);
        userRepository.save(user);
    }


}
