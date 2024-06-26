package com.RestroManagement.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RestroManagement.Entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
