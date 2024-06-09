package com.recencysoft.springsecurity.repository;

import com.recencysoft.springsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

   UserEntity findByUsername(String username);

}
