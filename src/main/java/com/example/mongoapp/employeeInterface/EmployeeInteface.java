package com.example.mongoapp.employeeInterface;

import com.example.mongoapp.EmployeeNotFoundException;
import com.example.mongoapp.dto.EmployeeDto;
import com.example.mongoapp.model.Employee;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

public interface EmployeeInteface {
    public String createEmployee(EmployeeDto employeeDto);
    public String deleteEmployee(Long employeeId);
    public String updateEmployee(EmployeeDto employeeDto);
    public Optional<Employee> getEmployee(Long employeeId) throws EmployeeNotFoundException;
}
