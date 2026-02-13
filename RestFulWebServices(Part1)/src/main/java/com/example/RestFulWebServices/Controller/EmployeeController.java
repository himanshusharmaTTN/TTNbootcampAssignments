package com.example.RestFulWebServices.Controller;

import com.example.RestFulWebServices.Model.Employee;
import com.example.RestFulWebServices.Service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllUsers()
    {
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Employee getAllUsers(@PathVariable long id )
    {
        return employeeService.findById(id);
    }

    @PostMapping("/add")
    public void addUser(@Valid @RequestBody Employee employee)
    {
        employeeService.addUser(employee);
    }
    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody Employee employee)
    {
        employeeService.deleteUser(employee);
    }
    @PutMapping("/update/{id}")
    public Employee updateUser(@Valid @RequestBody Employee employee, @PathVariable long id)
    {
       return employeeService.updateById(id,employee);
    }

}
