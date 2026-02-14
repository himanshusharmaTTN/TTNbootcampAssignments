package com.example.RestFulWebServices.Controller;


import com.example.RestFulWebServices.Model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class ContentNegotiationController {

    List<User> users = new ArrayList<>();

    @PostMapping()
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @GetMapping()
    public List<User> getUsers() {
        return users;
    }
}
