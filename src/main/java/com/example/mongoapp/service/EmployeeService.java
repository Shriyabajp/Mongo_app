package com.example.mongoapp.service;
import com.example.mongoapp.EmployeeNotFoundException;
import com.example.mongoapp.dto.EmployeeDto;
import com.example.mongoapp.employeeInterface.EmployeeInteface;
import com.example.mongoapp.employeerepository.EmployeeRepository;
import com.example.mongoapp.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

 public class EmployeeService implements EmployeeInteface {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String createEmployee(EmployeeDto employeeDto) {
        Employee created =employeeRepository.save(new Employee(employeeDto.getId(),employeeDto.getName()));
        return created.getName();
    }

    public String deleteEmployee(Long employeeId) {
        Optional<Employee> employeeFromDb = employeeRepository.findById(employeeId);
        Employee entity = employeeFromDb.get();
        employeeRepository.delete(entity);
        return "deleted";
    }

    public Optional<Employee> getEmployee(Long employeeId) throws EmployeeNotFoundException {
        Optional<Employee> employee =employeeRepository.findById(employeeId);
        if (!employee.isPresent())
            throw new EmployeeNotFoundException("employee not found");
        return employee;
    }

    public String updateEmployee(EmployeeDto employeeDto) {

        Employee update = employeeRepository.findById(employeeDto.getId()).get();
        update.setName(employeeDto.getName());
        employeeRepository.save(update);
        return "updated successfully";
    }







    }







