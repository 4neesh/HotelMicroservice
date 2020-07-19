package com.aneesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembershipInformationController {

	@Autowired
	private MembershipInformationService service;
	
	public MembershipInformationController(MembershipInformationService serviceArg) {
		this.service = serviceArg;
	}
	
	@GetMapping("/getMembership")
	public List<MemberInformationEntity> getMembership() {
		
		return service.getAll();
		
	}
	
	@PostMapping("/saveMemberInformation")
	public MemberInformationEntity saveMember(MemberInformationEntity entity) {
		
		service.save(entity);
		return entity;
		
	}
	
	
}
