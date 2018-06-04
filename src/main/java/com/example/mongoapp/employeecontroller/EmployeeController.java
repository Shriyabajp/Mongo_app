package com.example.mongoapp.employeecontroller;



import com.example.mongoapp.EmployeeNotFoundException;
import com.example.mongoapp.dto.EmployeeDto;
import com.example.mongoapp.employeeInterface.EmployeeInteface;
import com.example.mongoapp.model.Employee;
import com.example.mongoapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeInteface employeeInterface;

    @RequestMapping("/greet")
    public String greet(@RequestParam String name) {
        return "Welcome employee" + name;
    }

    //@RequestMapping("/greet1")
    //public String index1(@RequestParam Long id, @RequestParam String name){
    //return "Welcome employee"+ id + employeeService.createEmployee(new EmployeeDto(id,name));

    //}


    @RequestMapping(value = "/greetsecure", method = RequestMethod.POST)
    public String createEmployee(@RequestBody EmployeeDto employeeDto) {
        return "Welcome securely ----" + employeeInterface.createEmployee(employeeDto);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete(@RequestParam Long employeeId) {
        employeeInterface.deleteEmployee(employeeId);
        return "Deleted securely ----";
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Optional<Employee> get(@RequestParam Long employeeId) throws EmployeeNotFoundException {

           return employeeInterface.getEmployee(employeeId);



    }
    @RequestMapping(value ="/update" , method = RequestMethod.PUT)
    public String update(@RequestBody EmployeeDto employeeDto)  {
        return employeeInterface.updateEmployee(employeeDto);

    }



}

















