package com.example.examspring2.controllers;

import com.example.examspring2.entities.Project;
import com.example.examspring2.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectController {
  @Autowired
  private ProjectService projectService;

  @GetMapping
  public String getAllProjects(Model model) {
    model.addAttribute("projects", projectService.getAllProjects());
    return "projectList";
  }

  @PostMapping
  public String addProject(@ModelAttribute Project project) {
    projectService.saveProject(project);
    return "redirect:/projects";
  }

  // other necessary methods
}
