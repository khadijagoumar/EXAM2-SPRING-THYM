package com.example.examspring2.services;

import com.example.examspring2.entities.Project;
import com.example.examspring2.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
  @Autowired
  private ProjectRepository projectRepository;

  public List<Project> getAllProjects() {
    return projectRepository.findAll();
  }

  public Project saveProject(Project project) {
    return projectRepository.save(project);
  }

  // other necessary methods
}
