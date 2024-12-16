package com.example.demo.Employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSerice {


    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeSerice(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeModel> findAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeModel findEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public EmployeeModel addEmployee(EmployeeModel employeeModel) {
        return employeeRepository.save(employeeModel);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

}
