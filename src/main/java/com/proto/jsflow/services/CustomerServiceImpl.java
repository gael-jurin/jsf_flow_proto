package com.proto.jsflow.services;

import org.springframework.stereotype.Service;

import com.proto.jsflow.exception.CustomerNotFoundException;
import com.proto.jsflow.view.CustomerBean;


@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
  
  public CustomerBean lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
    if("9725551234".equals(phoneNumber)) {
      CustomerBean customer = new CustomerBean();
      customer.setName("gael jurin");
      customer.setAddress("3700 Dunlavy Rd");
      customer.setCity("Rabat");
      customer.setZipCode("76210");
      customer.setPhoneNumber(phoneNumber);
      return customer;
    } else {
      throw new CustomerNotFoundException();
    }
  }
}
