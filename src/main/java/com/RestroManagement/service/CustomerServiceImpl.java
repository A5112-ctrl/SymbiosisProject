package com.RestroManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RestroManagement.Dao.CustomerRepository;
import com.RestroManagement.Entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository repo;
	
	@Override
	public Customer SaveCustomer(Customer customer) {
		return repo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return repo.findAll();
	}

	
	
}
