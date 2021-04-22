package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dao.IBookmarkedJobDao;
import com.cg.freelanceapp.dao.IFreelancerDao;
import com.cg.freelanceapp.dao.IJobDao;
import com.cg.freelanceapp.dao.ISkillDao;
import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;

@Service
public class BookmarkedJobServiceImpl implements IBookmarkedJobService {
	@Autowired
	IBookmarkedJobDao bookmarkedjobdao;
	@Autowired
	ISkillDao skilldao;
	@Autowired
	IFreelancerDao freelancerdao;
	@Autowired
	IJobDao jobdao;
	
	public BookmarkedJob bookmarkJob(BookmarkedJobDTO bjd) 
	{
		BookmarkedJob bj=new BookmarkedJob();
	
		bj.setSkill(skilldao.findById(bjd.getSkillId()).get());
		bj.setFreelancer(freelancerdao.findById(bjd.getFreelancerId()).get());
		bj.setJob(jobdao.findById(bjd.getJobId()).get());
		
		return bookmarkedjobdao.save(bj);
		
	}
	
	public void remove(Long BId)
	{
		BookmarkedJob bj=bookmarkedjobdao.findById(BId).get();
		bookmarkedjobdao.delete(bj);
	}

	@Override
	public BookmarkedJob findById(Long id) {
		// TODO Auto-generated method stub
		return bookmarkedjobdao.findById(id).get();
	}

	@Override
	public List<BookmarkedJob> findBookmarkedJobsBySkillId(Long SId) {
		// TODO Auto-generated method stub
		return bookmarkedjobdao.findBookmarkedJobsBySkillId(SId);
	}
	
	
	
	
	
	
	

}
