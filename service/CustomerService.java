package com.RestroManagement.service;

import java.util.List;

import com.RestroManagement.Entity.Customer;

public interface CustomerService {

	Customer SaveCustomer(Customer customer);
	List<Customer> getAllCustomers();
	
}
