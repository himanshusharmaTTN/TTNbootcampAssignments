package com.example.RestFulWebServices.Controller;


import com.example.RestFulWebServices.Model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/swagger-users")
@Tag(name = "Swagger Controller", description = "APIs for managing users")
public class SwaggerController {

    List<User> users = new ArrayList<>();

    @Operation(
            summary = "Get all users",
            description = "Fetches the list of all users"
    )
    @GetMapping
    public List<User> getUsers() {
        return users;
    }

    @Operation(
            summary = "Create user",
            description = "Saves a new user in the system"
    )
    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @Operation(
            summary = "Delete user",
            description = "Deletes user by ID"
    )
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.removeIf(u -> u.getId() == id);
        return "User deleted";
    }
}
