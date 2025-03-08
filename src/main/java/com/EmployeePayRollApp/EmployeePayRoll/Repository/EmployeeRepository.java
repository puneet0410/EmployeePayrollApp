package com.EmployeePayRollApp.EmployeePayRoll.Repository;

import com.EmployeePayRollApp.EmployeePayRoll.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}