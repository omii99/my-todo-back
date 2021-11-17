package com.projects.projectstodo.repository;


import com.projects.projectstodo.model.Projects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectsRepository extends JpaRepository<Projects, Integer> {
    List<Projects> getProjectsByStatus(String status);

    List<Projects> getProjectsByOwner(String owner);

    Projects getProjectsByProjectId(int id);
}
