package com.RestroManagement.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestroManagement.Dao.AdminRepository;
import com.RestroManagement.Entity.Admin;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepo;
	
	@Override
	public Admin saveAdmin(Admin admin) {
		
		return adminRepo.save(admin);
	}

	@Override
	public List<Admin> getListOfAdmin() {
		List<Admin> findAll = adminRepo.findAll();
		return findAll;
	}

	

}