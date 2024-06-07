package com.example.examspring2.repositories;

import org.springframework.stereotype.Repository;
import com.example.examspring2.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
