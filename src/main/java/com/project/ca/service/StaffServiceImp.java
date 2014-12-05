package com.project.ca.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.project.ca.repository.StaffRepository;

@Service
public class StaffServiceImp implements StaffService {
	
	@Resource
	private StaffRepository staffref;
	
	
	public String getstaffid(String staffid)
	{
		String temp=null;
	
			temp = staffref.findOne(staffid).getFirstname();
	
			
			return temp;
	}
	

}
