

package com.RestroManagement.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.RestroManagement.Entity.Admin;
import com.RestroManagement.Entity.AdminLog;
import com.RestroManagement.service.AdminService;

import jakarta.validation.Valid;

@Controller
public class AdminLoginController {
	
	@Autowired
	private AdminService admService;
	
	
	@GetMapping("/loginForm")
	public String getLogin(Model model) {
		model.addAttribute("adminlog", new AdminLog());
		return "adminlogin";
		
	}
	
	@PostMapping("/dashboard")
	public String getDashboard(@Valid @ModelAttribute("adminlog") AdminLog adminLog,BindingResult bindingResult, Model model) {
	if(bindingResult.hasErrors()) {
		
		return "adminlogin";
	}
	List<Admin> listOfAdmin = admService.getListOfAdmin();
		String username = adminLog.getUsername();
		String password = adminLog.getPassword();
		boolean found= false;
		int id= 0;
		for(Admin adm : listOfAdmin) {
			if(adm.getUsername().equals(username) && adm.getPassword().equals(password)) {
				id = adm.getId();
				found= true;

			}
			if(found== true) {
				
				return "admindashboard1";
		
		
	}else {
		model.addAttribute("error", "Username or password is not correct");
		return "adminlogin";
	}
		}
		return "adminlogin";
		
		
	}


}
