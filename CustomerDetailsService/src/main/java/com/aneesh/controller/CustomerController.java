package com.aneesh.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aneesh.service.CustomerDetailsEntity;
import com.aneesh.service.CustomerDetailsService;

@RestController
public class CustomerController {

	private CustomerDetailsService detailsService;
	
	
	public CustomerController(CustomerDetailsService service) {
		detailsService = service;
	}
	
	@GetMapping("/getAll")
	public List<CustomerDetailsEntity> getAllDetails(){
		
		List<CustomerDetailsEntity> details = detailsService.findAll();
		return details;
	}
	
	@PostMapping("/save")
	public CustomerDetailsEntity saveDetails(@RequestBody CustomerDetailsEntity entity) {
		
		return detailsService.save(entity);
		
	}
	
	@GetMapping("/get/{id}")
	public CustomerDetailsEntity getCustomer(@PathVariable int id) {
		
		
		CustomerDetailsEntity temp = detailsService.get(id);
		return temp;
		
	}
	
}