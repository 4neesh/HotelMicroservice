package com.aneesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aneesh.repository.CustomerDetailsRepository;

@Service
public class CustomerDetailsService  {

	
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
	
	public CustomerDetailsEntity get(int id) {
		
		return detailsRepository.findById(id).get();
	}
}
