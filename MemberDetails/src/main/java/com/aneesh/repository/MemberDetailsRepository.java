package com.aneesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aneesh.service.MemberDetailsEntity;

public interface MemberDetailsRepository extends JpaRepository<MemberDetailsEntity, Integer>{

}
