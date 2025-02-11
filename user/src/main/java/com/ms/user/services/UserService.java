package com.ms.user.services;

import com.ms.user.entity.UserEntity;
import com.ms.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Transactional
    public UserEntity save(UserEntity userEntity){
        return userRepository.save(userEntity);
    }
}
