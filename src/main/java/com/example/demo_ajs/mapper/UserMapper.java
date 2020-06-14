package com.example.demo_ajs.mapper;

import com.example.demo_ajs.entity.UserEntity;
import com.example.demo_ajs.objects.UserDto;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public UserDto getUserDto(UserEntity userEntity) {
        UserDto resultDto = new UserDto();
        resultDto.setId(userEntity.getId());
        resultDto.setName(userEntity.getName());
        resultDto.setPhone(userEntity.getPhone());
        resultDto.setMobilePhone(userEntity.getMobilePhone());
        resultDto.setEmail(userEntity.getEmail());
        resultDto.setAddress(userEntity.getAddress());
        return resultDto;
    }

    public UserEntity getUserEntity(UserDto userDto) {
        UserEntity resultEntity = new UserEntity();
        resultEntity.setId(userDto.getId());
        resultEntity.setName(userDto.getName());
        resultEntity.setPhone(userDto.getPhone());
        resultEntity.setMobilePhone(userDto.getMobilePhone());
        resultEntity.setEmail(userDto.getEmail());
        resultEntity.setAddress(userDto.getAddress());
        return resultEntity;
    }
}
