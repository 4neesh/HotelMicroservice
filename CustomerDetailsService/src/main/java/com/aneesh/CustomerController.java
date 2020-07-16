package com.aneesh;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	
	@PostMapping("/addDetails")
	public CustomerDetailsEntity saveDetails(@RequestBody CustomerDetailsEntity entity) {
		
		return detailsService.save(entity);
		
	}
	
}