package com.aneesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.service.MemberDetailsEntity;
import com.aneesh.service.MembershipDetailsService;

@RestController
public class MemberDetailsController {

	private MembershipDetailsService service;
	

	@Autowired
	public MemberDetailsController(MembershipDetailsService serviceArg) {
		this.service = serviceArg;
	}
	
	@GetMapping("/getAll")
	public List<MemberDetailsEntity> getMembership() {
		
		return service.getAll();
		
	}
	
	@PostMapping("/save")
	public MemberDetailsEntity saveMember(@RequestBody MemberDetailsEntity entity) {
		
		return service.save(entity);
		
	}
	
	
}
