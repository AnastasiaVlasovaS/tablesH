package com.example.tablesH;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/by-city")
    public List<User> getPersonsByCity(@RequestParam String city) {
        return userService.getPersonsByCity(city);
    }
}