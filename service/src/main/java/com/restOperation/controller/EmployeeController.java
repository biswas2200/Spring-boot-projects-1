package com.restOperation.controller;

import com.restOperation.model.Employee;
import com.restOperation.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    //logic behind post mapping.
    @PostMapping("/employees")
    public String createNewEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "EMPLOYEE_CREATED_IN_DATABASE";
    }
    //retrieve all employee data
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployeeData(){
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return new ResponseEntity<List<Employee>>(employeeList, HttpStatus.OK);
    }
    //retrieve by employee id
    @GetMapping("/employees/{empid}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable long empid){
        Optional<Employee> employee = employeeRepository.findById(empid);
        if (employee.isPresent())
            return new ResponseEntity<Employee>(employee.get(),HttpStatus.FOUND);
        else
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/employees/{empid}")
    public String updateEmployeeById(@PathVariable long empid,
                                     @RequestBody Employee employee){
        Optional<Employee> employeeOptional = employeeRepository.findById(empid);
        if (employeeOptional.isPresent()){
            Employee existingEmployee = employeeOptional.get();
            existingEmployee.setEmp_name(employee.getEmp_name());
            existingEmployee.setEmp_salary(employee.getEmp_salary());
            existingEmployee.setEmp_age(employee.getEmp_age());
            existingEmployee.setEmp_city(employee.getEmp_city());
            employeeRepository.save(existingEmployee);
            return "EMPLOYEE_DETAILS_UPDATED_BY_"+empid+"_ID" ;
        }else
            return "EMPLOYEE_DETAIL_NOT_EXIST";
    }

    @DeleteMapping("/employees/{empid}")
    public String deleteEmployeeById(@PathVariable long empid){
        employeeRepository.deleteById(empid);
        return "EMPLOYEE_ENTRY_SUCCESSFULLY_DELETED";
    }
    @DeleteMapping("/employees")
    public String deleteAllEmployees(){
        employeeRepository.deleteAll();
        return "EMPLOYEES_DATA_DELETED";
    }
}
