package com.te.projectmanagementtool.dto;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MilestonesDTO {

	private String milestoneId;

	private String milestoneName;

	private String milestoneTask;

	private Double estimatedDevelopmentDays;

	private Double estimatedTestingDays;

	private LocalDate milestoneStartDate;

	private LocalDate milestoneEndDate;

	private LocalDate deliverableDate;

	private String scopeType;
}
