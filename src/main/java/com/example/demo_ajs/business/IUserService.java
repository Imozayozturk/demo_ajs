package com.example.demo_ajs.business;

import com.example.demo_ajs.objects.UserDto;

import java.util.List;

public interface IUserService {

    UserDto getUser(long userId);
    List<UserDto> getUserList();
    void createUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(long userId);
}
