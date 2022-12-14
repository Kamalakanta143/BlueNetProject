package com.marketingapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;

@RestController
public class RestLeadController {
	
	@Autowired
	private LeadRepository leadRepo;
	
	@GetMapping("/listAllLead")
	public List<Lead> getAllLeads(){
		List<Lead> leads = leadRepo.findAll();
		return leads;
		
	}
	@PostMapping("/saveApi")
	public void saveOneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteLead(@PathVariable long id) {
		leadRepo.deleteById(id);
	}
	@PutMapping("/updateApi")
	public void updateOneLead(@RequestBody Lead lead) {
		leadRepo.save(lead);
	}
	@GetMapping("/getapi/{id}")
	public Lead getOneLead(@PathVariable long id) {
		try {
			Optional<Lead> findById = leadRepo.findById(id);
			Lead lead = findById.get();
			return lead;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
