package com.aneesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.repository.MemberDetailsRepository;

@Service
public class MembershipDetailsService {

	private MemberDetailsRepository repository;
	
	@Autowired
	public MembershipDetailsService(MemberDetailsRepository repositoryArg) {
		this.repository = repositoryArg;
	}
	
	public List<MemberDetailsEntity> getAll(){
		
		return repository.findAll();
	}
	
	public MemberDetailsEntity save(MemberDetailsEntity entity) {
		
		return repository.save(entity);

	}
	
	public MemberDetailsEntity get(int cid) {
		
		MemberDetailsEntity temp = repository.findById(cid).get();
	
		return temp;
	}
	
	
}
