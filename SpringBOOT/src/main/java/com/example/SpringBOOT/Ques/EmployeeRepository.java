package com.example.SpringBOOT.Ques;

import com.example.SpringBOOT.Ques.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
