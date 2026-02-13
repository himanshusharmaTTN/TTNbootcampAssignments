package com.example.RestFulWebServices.Service;

import com.example.RestFulWebServices.Exceptions.EmployeeNiMila;
import com.example.RestFulWebServices.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    List<Employee> list =new ArrayList<>();

    public List<Employee> getAllEmployee()
    {
        return list;
    }
    public void addUser(Employee e)
    {
        list.add(e);
    }
    public void deleteUser(Employee e)
    {
        list.remove(e);
    }
    public Employee findById(long id)
    {
        for(Employee e : list)
        {
            if(e.getId()==id)
                return e;
        }
        throw new EmployeeNiMila("Employee not found with id: " + id);
    }
    public Employee updateById(long id,Employee employee)
    {
        for(Employee e : list)
        {
            if(e.getId()==id) {
                e.setAge(employee.getAge());
                e.setName(employee.getName());
                return e;
            }
        }
        throw new EmployeeNiMila("Employee not found with id: " + id);
    }
}
