package com.example.demo_ajs.controller;

import com.example.demo_ajs.business.IUserService;
import com.example.demo_ajs.objects.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users/{id}")
    public UserDto getUser(@PathVariable String id) {
        long userId = Long.parseLong(id);
        return userService.getUser(userId);
    }

    @GetMapping("/users")
    public List<UserDto> getUserList() {
        return userService.getUserList();
    }

    @PostMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public void createUser(@RequestBody UserDto userDto) {
        userService.createUser(userDto);
    }

    @PutMapping(path = "/users", consumes = "application/json", produces = "application/json")
    public void updateUser(@RequestBody UserDto userDto) {
        userService.updateUser(userDto);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable String id) {
        long userId = Long.parseLong(id);
        userService.deleteUser(userId);
    }
}
