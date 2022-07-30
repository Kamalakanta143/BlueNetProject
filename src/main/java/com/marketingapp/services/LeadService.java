package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entity.Lead;

public interface LeadService {
	public void saveLead(Lead lead);
	public List<Lead> getLeads();
	public void deleteLead(long id);
	public Lead updateLead(long id);

}
