package com.aneesh;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetailsEntity, Integer> {

}
