package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entity.Lead;
import com.marketingapp.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewLeadPage")
	public String viewOneLeadPage() {
		return "new_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveOneLead(@ModelAttribute Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		model.addAttribute("msg", "Lead is Save!!!");
		return "new_lead";
	}
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "lead_search_results";
	}
	
	@RequestMapping("/delete")
	public String deleteOneLocation(@RequestParam ("id") long id, ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "lead_search_results";
	}
	@RequestMapping("/update")
	public String updateOneLocation(@RequestParam ("id") long id, ModelMap model) {
		Lead lead = leadService.updateLead(id);
		model.addAttribute("lead", lead);
		return "new_update";
	}
	@RequestMapping("/updateLead")
	public String updateOneLead(@ModelAttribute Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "lead_search_results";
		
	}

}
