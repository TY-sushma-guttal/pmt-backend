package com.te.projectmanagementtool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.projectmanagementtool.dto.ProjectDetailsDTO;
import com.te.projectmanagementtool.service.ProjectDetailsService;
import com.te.projectmanagementtool.util.APIResponse;

@RestController
@RequestMapping("/project")
public class ProjectDetailsController {

	@Autowired
	private ProjectDetailsService projectDetailsService;

	@PostMapping("/add")
	public ResponseEntity<APIResponse> addProject(@RequestBody ProjectDetailsDTO projectDetailsDTO) {
		ProjectDetailsDTO response = projectDetailsService.addProject(projectDetailsDTO);
		if (response != null)
			return new ResponseEntity<>(APIResponse.builder().data(response).error(false).message(null).build(),
					HttpStatus.OK);
		else
			return new ResponseEntity<>(APIResponse.builder().data(response).error(true).message(null).build(),
					HttpStatus.NOT_FOUND);
	}

}
