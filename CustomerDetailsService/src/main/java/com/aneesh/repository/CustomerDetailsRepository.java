package com.aneesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aneesh.service.CustomerDetailsEntity;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsEntity, Integer> {

}
