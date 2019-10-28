package com.pps.pps.services;

import com.pps.pps.domain.Project;
import com.pps.pps.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
  @Autowired
  private ProjectRepository projectRepository;

  public Project saveOrUpdateProject(Project project) {

    return projectRepository.save(project);
  }
}
