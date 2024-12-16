package com.example.demo.Employee;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@Table(name = "employee")
@Entity
@CrossOrigin("*")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int age;
    private String department;

    public EmployeeModel() {
    }

    public EmployeeModel(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
