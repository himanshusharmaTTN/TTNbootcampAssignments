package com.example.RestFulWebServices.Controller;

import com.example.RestFulWebServices.Model.DynamicUser;
import com.example.RestFulWebServices.Model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilteringController {

//    List<User> userss = new ArrayList<>();
//
//    @PostMapping("/users-static")
//    public User saveUserStatic(@RequestBody User user) {
//        userss.add(user);
//        return user;
//    }


    List<DynamicUser> users = new ArrayList<>();

    @PostMapping("/users-dynamic")
    public String saveUserDynamic(@RequestBody DynamicUser user) throws Exception {

        users.add(user);

        SimpleBeanPropertyFilter filter =
                SimpleBeanPropertyFilter.filterOutAllExcept("id","name","email");
        FilterProvider filters =
                new SimpleFilterProvider().addFilter("UserFilter", filter);

        ObjectMapper mapper = new ObjectMapper();
        mapper.setFilterProvider(filters);

        return mapper.writeValueAsString(user);
    }

}
