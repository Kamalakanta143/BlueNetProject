package com.marketingapp.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.marketingapp.entity.Lead;

public interface LeadRepository extends JpaRepositoryImplementation<Lead, Long> {

}
