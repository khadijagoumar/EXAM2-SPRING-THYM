package com.example.examspring2.controllers;

import com.example.examspring2.entities.Employee;
import com.example.examspring2.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
  @Autowired
  private EmployeeService employeeService;

  @GetMapping
  public String getAllEmployees(Model model) {
    model.addAttribute("employees", employeeService.getAllEmployees());
    return "employeeList";
  }

  @PostMapping
  public String addEmployee(@ModelAttribute Employee employee) {
    employeeService.saveEmployee(employee);
    return "redirect:/employees";
  }

  // other necessary methods
}
