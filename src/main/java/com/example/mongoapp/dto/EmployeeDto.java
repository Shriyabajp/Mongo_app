package com.example.mongoapp.dto;

public class EmployeeDto {
    private Long id;
    private String name;

    public EmployeeDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }



    public EmployeeDto(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
