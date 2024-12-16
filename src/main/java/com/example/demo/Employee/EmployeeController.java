package com.example.demo.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeSerice employeeService;

    @Autowired
    public EmployeeController(EmployeeSerice employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping()
    public List<EmployeeModel> getAllEmployees() {
        return employeeService.findAllEmployees();
    }

    @PostMapping("/save")
    public ResponseEntity<EmployeeModel> saveEmployee(@RequestBody EmployeeModel employeeModel) {
        try {
            EmployeeModel savedEmployee = employeeService.addEmployee(employeeModel);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
