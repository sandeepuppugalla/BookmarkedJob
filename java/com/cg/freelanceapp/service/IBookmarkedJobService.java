package com.cg.freelanceapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.freelanceapp.dto.BookmarkedJobDTO;
import com.cg.freelanceapp.entities.BookmarkedJob;
import com.cg.freelanceapp.entities.Freelancer;
import com.cg.freelanceapp.entities.Job;
import com.cg.freelanceapp.entities.Skill;

@Service
public interface IBookmarkedJobService {

	BookmarkedJob bookmarkJob(BookmarkedJobDTO bjd);

	void remove(Long BId);

	BookmarkedJob findById(Long id);

	List<BookmarkedJob> findBookmarkedJobsBySkillId(Long SId);

}
