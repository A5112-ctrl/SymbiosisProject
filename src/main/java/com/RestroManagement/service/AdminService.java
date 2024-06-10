package com.RestroManagement.service;
import java.util.List;

import com.RestroManagement.Entity.Admin;

public interface AdminService {
	
	public Admin saveAdmin(Admin admin);
	
	public List<Admin> getListOfAdmin();

}
