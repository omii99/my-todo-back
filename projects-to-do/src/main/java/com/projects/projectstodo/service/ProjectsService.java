package com.projects.projectstodo.service;


import com.projects.projectstodo.model.Projects;
import com.projects.projectstodo.utill.ResponseMessage;

import java.util.List;

public interface ProjectsService {
    ResponseMessage addProject(Projects projects);

    List<Projects> getAllProjects();

    List<Projects> getProjectsByStatus(String status);

    List<Projects> getProjectsByOwner(String owner);

    ResponseMessage editProjects(Projects projects, int id);

    ResponseMessage deleteProjects(int id);
}
