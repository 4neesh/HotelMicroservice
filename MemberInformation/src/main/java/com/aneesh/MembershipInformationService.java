package com.aneesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembershipInformationService {

	private MemberInformationRepository repository;
	
	@Autowired
	public MembershipInformationService(MemberInformationRepository repositoryArg) {
		this.repository = repositoryArg;
	}
	
	public List<MemberInformationEntity> getAll(){
		
		return repository.findAll();
	}
	
	public MemberInformationEntity save(MemberInformationEntity entity) {
		
		return repository.save(entity);

	}
	
	
}
