package com.aneesh;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsService {

	
	private CustomerDetailsRepository detailsRepository;
	
	@Autowired
	public CustomerDetailsService(CustomerDetailsRepository repository) {
		detailsRepository = repository;
	}
	
	public List<CustomerDetailsEntity> findAll(){
		return detailsRepository.findAll();
	}
	
	public CustomerDetailsEntity findCustomer(int id) {
		Optional<CustomerDetailsEntity> tempCustomer = detailsRepository.findById(id);
		
		if(tempCustomer.isPresent()) {
			return tempCustomer.get();
		}
		else {
			return null;
		}
	}
	
	public CustomerDetailsEntity save(CustomerDetailsEntity entity) {
		return detailsRepository.save(entity);
	}
	
}
