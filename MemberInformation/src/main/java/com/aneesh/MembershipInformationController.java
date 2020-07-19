package com.aneesh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
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
	public void saveMember(MemberInformationEntity entity) {
		
		service.save(entity);
	}
	
	
}
