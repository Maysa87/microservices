package com.ms.user.controllers;

import com.ms.user.dtos.UserRecordDto;
import com.ms.user.entity.UserEntity;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<UserEntity> saveUser(@RequestBody @Valid UserRecordDto userRecordDto){
        var userEntity = new UserEntity();
        BeanUtils.copyProperties(userRecordDto, userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body();
    }
}
