package com.RestroManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.RestroManagement.Entity.Customer;
import com.RestroManagement.Entity.CustomerLog;
import com.RestroManagement.service.CustomerService;

import jakarta.validation.Valid;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/gallary")
	public String GallaryRooms() {
		return "gallary";
	}
	
	@GetMapping("/CustloginForm")
	public String getLogin(Model model) {
		model.addAttribute("custlog", new CustomerLog());
		return "Custlogin";
	}

	@PostMapping("/custdashboard")
	public String getDashboard(@Valid @ModelAttribute("custlog") CustomerLog custlog, Model model, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "Custlogin";
		}
		List<Customer> customerList= service.getAllCustomers();
		return "";
		
	}
}
