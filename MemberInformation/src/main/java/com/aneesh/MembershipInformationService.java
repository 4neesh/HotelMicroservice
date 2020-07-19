package com.aneesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembershipInformationService {

	@Autowired
	private MemberInformationRepository repository;
	
	public MembershipInformationService(MemberInformationRepository repositoryArg) {
		this.repository = repositoryArg;
	}
	
	public List<MemberInformationEntity> getAll(){
		
		return repository.findAll();
	}
	
	public void save(MemberInformationEntity entity) {
		repository.save(entity);

	}
}
