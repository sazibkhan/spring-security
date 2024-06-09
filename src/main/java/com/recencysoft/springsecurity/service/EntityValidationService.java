package com.recencysoft.springsecurity.service;
import com.recencysoft.springsecurity.entity.UserEntity;
import com.recencysoft.springsecurity.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;


@Service
@AllArgsConstructor
public class EntityValidationService {

    private final UserRepository userRepository;

    public UserEntity validateProfile(Long id) {
        Objects.requireNonNull(id);
        return userRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException(
                        String.format("User  not found with id [%s]", id)));
    }


}
