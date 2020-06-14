package com.example.demo_ajs.business.implementation;

import com.example.demo_ajs.business.IUserService;
import com.example.demo_ajs.entity.UserEntity;
import com.example.demo_ajs.mapper.UserMapper;
import com.example.demo_ajs.objects.UserDto;
import com.example.demo_ajs.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDto getUser(long userId) {
        UserEntity userEntity = userRepository.findById(userId).get();
        return userMapper.getUserDto(userEntity);
    }

    @Override
    public List<UserDto> getUserList() {
        Iterable<UserEntity> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();
        for (UserEntity userEntity : userList) {
            UserDto userDto = userMapper.getUserDto(userEntity);
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

    @Override
    public void createUser(UserDto userDto) {
        UserEntity userEntity = userMapper.getUserEntity(userDto);
        userRepository.save(userEntity);
    }

    @Override
    public void updateUser(UserDto userDto) {
        UserEntity userEntity = userMapper.getUserEntity(userDto);
        userRepository.save(userEntity);
    }

    @Override
    public void deleteUser(long userId) {
        userRepository.deleteById(userId);
    }
}
