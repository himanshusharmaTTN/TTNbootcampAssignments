package com.example.SpringBOOT.Ques;

import com.example.SpringBOOT.Ques.Employee;
import com.example.SpringBOOT.Ques.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repo;

    public DataLoader(EmployeeRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) {

        System.out.println("Inserting employees");

        repo.save(new Employee("Himanshu", "Backend Developer"));
        repo.save(new Employee("Rahul", "Tester"));
        repo.save(new Employee("Ankit", "DevOps"));
        repo.save(new Employee("Priya", "HR"));

        System.out.println("All Employees:");

        repo.findAll().forEach(e ->
                System.out.println(e.getId() + " " + e.getName() + " " + e.getDesignation()+"....")
        );
    }
}
