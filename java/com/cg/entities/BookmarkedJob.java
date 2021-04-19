package com.cg.freelanceapp.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BookmarkedJob {
	@Id
	Long id;
	Skill skill;
	Job job;
	Freelancer freelancer;
	public BookmarkedJob() {
		super();
	}
	public BookmarkedJob(Long id, Skill skill, Job job, Freelancer freelancer) {
		super();
		this.id = id;
		this.skill = skill;
		this.job = job;
		this.freelancer = freelancer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Freelancer getFreelancer() {
		return freelancer;
	}
	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}
	
}
