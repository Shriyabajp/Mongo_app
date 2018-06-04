package com.example.mongoapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;






@Document(collection =Employee.COLLECTION_NAME)

public class Employee {

    public static final String COLLECTION_NAME="employees";

    @Id


    private Long employeeId;


    private String name;


    public Employee(Long employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }
    public Employee(){

    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}



