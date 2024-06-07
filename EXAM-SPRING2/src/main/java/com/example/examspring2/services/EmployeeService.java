package com.example.examspring2.services.;
import com.example.examspring2.entities.Employee;
import com.example.examspring2.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
  @Autowired
  private EmployeeRepository employeeRepository;

  public Object getAllEmployees() {
    return employeeRepository.findAll();
  }

  public Employee saveEmployee(Employee employee) {
    return employeeRepository.save(employee);
  }

}
