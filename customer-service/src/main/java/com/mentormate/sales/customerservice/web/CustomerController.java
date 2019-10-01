package com.mentormate.sales.customerservice.web;

import com.mentormate.sales.customerservice.domain.Customer;
import com.mentormate.sales.customerservice.service.CustomerService;
import com.mentormate.sales.customerservice.web.dto.CreateCustomerRequest;
import com.mentormate.sales.customerservice.web.dto.CreateCustomerResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CustomerController {

	private final CustomerService customerService;

	@PostMapping("/customers")
	public CreateCustomerResponse createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
		Customer customer = customerService.createCustomer(createCustomerRequest.getName(), createCustomerRequest.getCreditLimit());
		return new CreateCustomerResponse(customer.getId());
	}
}

