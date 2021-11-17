package com.projects.projectstodo.serviceImpl;


import com.projects.projectstodo.model.Projects;
import com.projects.projectstodo.repository.ProjectsRepository;
import com.projects.projectstodo.service.ProjectsService;
import com.projects.projectstodo.utill.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsServiceImpl implements ProjectsService {

    @Autowired
    ProjectsRepository projectsRepository;
    ResponseMessage responseMessage;

    @Override
    public ResponseMessage addProject(Projects projects) {
        try {
            projectsRepository.save(projects);
            responseMessage = new ResponseMessage("200","Project Saved Success!");
        }catch (NullPointerException e){
            responseMessage = new ResponseMessage("500", "Error!");
        }

        return responseMessage;
    }

    @Override
    public List<Projects> getAllProjects() {
        return projectsRepository.findAll();
    }

    @Override
    public List<Projects> getProjectsByStatus(String status) {
        return projectsRepository.getProjectsByStatus(status);
    }

    @Override
    public List<Projects> getProjectsByOwner(String owner) {
        return projectsRepository.getProjectsByOwner(owner);
    }

    @Override
    public ResponseMessage editProjects(Projects projects,int id) {
        Projects existingDetails=(Projects) projectsRepository.getProjectsByProjectId(projects.getProjectId());
        try{
            if(projects.getTitle()!=null){
                existingDetails.setTitle(projects.getTitle());
            }
            if(projects.getDescription()!=null){
                existingDetails.setDescription(projects.getDescription());
            }
            if(projects.getStartDate()!=null){
                existingDetails.setStartDate(projects.getStartDate());
            }
            if (projects.getEndDate()!=null){
                existingDetails.setEndDate(projects.getEndDate());
            }
            if (projects.getOwner()!=null){
                existingDetails.setOwner(projects.getOwner());
            }
            if (projects.getStatus()!=null){
                existingDetails.setStatus(projects.getStatus());
            }
            projectsRepository.save(existingDetails);
            responseMessage = new ResponseMessage("200", "Update successful");
        }catch (Exception e){
            responseMessage = new ResponseMessage("500", "Exception occurred");
        }
        return responseMessage;
    }

    @Override
    public ResponseMessage deleteProjects(int id) {
        try{
            projectsRepository.deleteById(id);
            responseMessage = new ResponseMessage("200","Delete Success!");
        }catch (Exception e){
            responseMessage = new ResponseMessage("400","An error occurred while deleting");
        }
        return responseMessage;
    }
}
