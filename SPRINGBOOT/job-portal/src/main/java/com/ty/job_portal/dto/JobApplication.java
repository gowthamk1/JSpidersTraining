package com.ty.job_portal.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class JobApplication {
    @GeneratedValue(generator = "application_id")
    @SequenceGenerator(name = "application_id", initialValue = 121101, allocationSize = 1)
    @Id
    private int id;
    @CreationTimestamp
    private LocalDateTime appliedTime;
    private String status;
    @OneToOne
    private Job job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDateTime getAppliedTime() {
		return appliedTime;
	}
	public void setAppliedTime(LocalDateTime appliedTime) {
		this.appliedTime = appliedTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
}
