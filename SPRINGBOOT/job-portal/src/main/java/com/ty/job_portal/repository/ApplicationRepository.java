package com.ty.job_portal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.job_portal.dto.Job;
import com.ty.job_portal.dto.JobApplication;

public interface ApplicationRepository extends JpaRepository<JobApplication,Integer>{

    List<JobApplication> findByJob(Job job);

}
