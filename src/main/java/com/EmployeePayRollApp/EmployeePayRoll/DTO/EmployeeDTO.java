package com.EmployeePayRollApp.EmployeePayRoll.DTO;

public class EmployeeDTO {

    private String name;
    private double salary;

    // No-argument constructor
    public EmployeeDTO() {
    }

    // All-argument constructor
    public EmployeeDTO(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method (optional)
    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
