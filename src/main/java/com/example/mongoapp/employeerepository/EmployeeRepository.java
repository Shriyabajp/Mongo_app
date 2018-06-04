package com.example.mongoapp.employeerepository;

import com.example.mongoapp.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface EmployeeRepository extends MongoRepository<Employee,Long> {

}



