package com.aneesh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.aneesh.service.CustomerDetailsEntity;
import com.aneesh.service.MemberDetailsEntity;
import com.aneesh.service.MembershipDetailsService;

import brave.Span;
import brave.Tracer;

@RestController
public class MemberDetailsController {

	private MembershipDetailsService service;
	
	private static Logger LOGGER = LoggerFactory.getLogger(MemberDetailsController.class);

	@Autowired
	public MemberDetailsController(MembershipDetailsService serviceArg) {
		this.service = serviceArg;
	}
	
	@Autowired
	private RestTemplate template;
	
	@Autowired
	private Tracer tracer;
	
	@GetMapping("/getAll")
	public List<MemberDetailsEntity> getMembership() {
		
		return service.getAll();
		
	}
	
	@GetMapping("/getTest")
	public String getTest() {
		
		ResponseEntity<String> customerDetail = template.getForEntity("http://localhost:8883/get/1", String.class);
		return customerDetail.getBody();
	}
	
	@GetMapping("/getTest2")
	public String getTest2() {
		
		ResponseEntity<String> customerDetail = template.getForEntity("http://customer-details-service/get/1", String.class);
		return customerDetail.getBody();
	}
	
	@PostMapping("/save")
	public MemberDetailsEntity saveMember(@RequestBody MemberDetailsEntity entity) {
		
		return service.save(entity);
		
	}
	
	@GetMapping("/get/{id}")
	public MemberDetailsEntity getMember(@PathVariable int id) {
		
		LOGGER.info("Get member");
		Span span = tracer.nextSpan().name("memberDetailSpan").start();
		MemberDetailsEntity temp = service.get(id);
		try {
		
		span.tag("getMemberId", Integer.toString(id));
		
		if(temp == null) {
			throw new RuntimeException("Member with id: " + id + " does not exist.");
		}
		}
		finally {
		span.finish();
		}
		return temp;
	}
	
	
}
