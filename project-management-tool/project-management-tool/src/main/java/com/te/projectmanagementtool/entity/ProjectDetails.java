package com.te.projectmanagementtool.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "pmt_project_details")
public class ProjectDetails {
	
	@Id
	private String projectId;

	private String projectName;

	private String projectDomain;

	private String clientName;

	private LocalDate projectStartDate;

	private LocalDate projectEndDate;

	private String projectStatus;

	private String projectManager;

	private String projectLead;

	private Map<String, String> projectMembers;

	private List<MilestoneDetails> milestoneDetails = new ArrayList<>();

}
