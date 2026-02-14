package com.example.RestFulWebServices.Controller;

import com.example.RestFulWebServices.Model.User;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class HateoasController {

    List<User> users = new ArrayList<>();

    public HateoasController() {
        users.add(new User(1,"Himanshu","h@gmail.com",""));
        users.add(new User(2,"Rohit","r@gmail.com",""));
    }

    @GetMapping("/Husers/{id}")
    public EntityModel<User> getUser(@PathVariable int id) {

        User user = users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow();

        EntityModel<User> resource = EntityModel.of(user);

        resource.add(linkTo(methodOn(HateoasController.class)
                .getAllUsers()).withRel("all-users"));
        return resource;
    }
    @GetMapping("/Husers")
    public List<User> getAllUsers() {
        return users;
    }
}
