package com.te.projectmanagementtool.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.projectmanagementtool.dto.ProjectDetailsDTO;
import com.te.projectmanagementtool.entity.ProjectDetails;
import com.te.projectmanagementtool.repository.ProjectDetailsRepository;

@Service
public class ProjectDetailsService {

	@Autowired
	private ProjectDetailsRepository projectDetailsRepository;

	public ProjectDetailsDTO addProject(ProjectDetailsDTO projectDetailsDTO) {
		Optional<ProjectDetails> projectOptional = projectDetailsRepository.findById(projectDetailsDTO.getProjectId());
		if (projectOptional.isPresent()) {
			ProjectDetails existedProject = projectOptional.get();
			BeanUtils.copyProperties(projectDetailsDTO, existedProject);
			projectDetailsRepository.save(existedProject);
			return projectDetailsDTO;
		} else {
			ProjectDetails newProject = new ProjectDetails();
			BeanUtils.copyProperties(projectDetailsDTO, newProject);
			ProjectDetails savedProject = projectDetailsRepository.save(newProject);
			BeanUtils.copyProperties(savedProject, projectDetailsDTO);
			return projectDetailsDTO;
		}
	}

}
