package com.te.projectmanagementtool.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.te.projectmanagementtool.entity.ProjectDetails;

@Repository
public interface ProjectDetailsRepository extends MongoRepository<ProjectDetails, String> {

}
