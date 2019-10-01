package com.mentormate.sales.customerservice.service;

import com.mentormate.sales.common.value.Money;
import com.mentormate.sales.customerservice.domain.Customer;
import com.mentormate.sales.customerservice.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerService {
	private final CustomerRepository customerRepository;

	public Customer createCustomer(String name, Money creditLimit) {
		Customer customer  = new Customer(name, creditLimit);
		return customerRepository.save(customer);
	}
}
