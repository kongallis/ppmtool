package com.kongallis.ppmtool.services;

import com.kongallis.ppmtool.domain.Project;
import com.kongallis.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        // Logic
        return projectRepository.save(project);
    }
}
