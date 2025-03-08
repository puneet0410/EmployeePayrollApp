package com.EmployeePayRollApp.EmployeePayRoll.Service;

import com.EmployeePayRollApp.EmployeePayRoll.DTO.EmployeeDTO;
import com.EmployeePayRollApp.EmployeePayRoll.Entity.Employee;
import com.EmployeePayRollApp.EmployeePayRoll.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {

        return employeeRepository.findById(id);
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        System.out.println("Saving Employee: " + employee.getName());

        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, EmployeeDTO updatedEmployee) {
        return employeeRepository.findById(id).map(employee -> {
            employee.setName(updatedEmployee.getName());
            employee.setSalary(updatedEmployee.getSalary());
            return employeeRepository.save(employee);
        }).orElse(null);
    }

    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);
    }
}