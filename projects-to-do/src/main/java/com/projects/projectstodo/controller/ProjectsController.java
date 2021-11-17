package com.projects.projectstodo.controller;


import com.projects.projectstodo.model.Projects;
import com.projects.projectstodo.service.ProjectsService;
import com.projects.projectstodo.utill.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/projects")
public class ProjectsController {

    @Autowired
    ProjectsService projectsService;

    @PostMapping("add")
    ResponseMessage addProject (@RequestBody Projects projects){
        return projectsService.addProject(projects);
    }
    @GetMapping("viewall")
    List<Projects> getAllProjects(){
        return projectsService.getAllProjects();
    }
    @GetMapping ("viewbystatus/{status}")
    List<Projects> getProjectsByStatus(@PathVariable String status){
        return projectsService.getProjectsByStatus(status);
    }
    @GetMapping ("viewbyowner/{owner}")
    List<Projects> getProjectsByOwner(@PathVariable String owner){
        return projectsService.getProjectsByOwner(owner);
    }
    @PutMapping("edit/{id}")
    ResponseMessage editProject(@RequestBody Projects projects,@PathVariable Integer id){
        return projectsService.editProjects(projects,id);
    }
    @DeleteMapping("delete/{id}")
    ResponseMessage deleteProjects(@PathVariable int id){
        return projectsService.deleteProjects(id);
    }




}
