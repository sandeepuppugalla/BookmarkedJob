package com.cg.freelanceapp.dto;

public class BookmarkedJobDTO 
{
	Long skillId;
	Long freelancerId;
	Long jobId;
	public BookmarkedJobDTO() {
		super();
	}
	public BookmarkedJobDTO(Long skillId, Long freelancerId, Long jobId) {
		super();
		this.skillId = skillId;
		this.freelancerId = freelancerId;
		this.jobId = jobId;
	}
	public Long getSkillId() {
		return skillId;
	}
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
	public Long getFreelancerId() {
		return freelancerId;
	}
	public void setFreelancerId(Long freelancerId) {
		this.freelancerId = freelancerId;
	}
	public Long getJobId() {
		return jobId;
	}
	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}
	
	

}
