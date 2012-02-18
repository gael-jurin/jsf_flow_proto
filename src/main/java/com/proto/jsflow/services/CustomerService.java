package com.proto.jsflow.services;

import com.proto.jsflow.exception.CustomerNotFoundException;
import com.proto.jsflow.view.CustomerBean;

public interface CustomerService {
	CustomerBean lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}