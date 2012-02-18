package com.proto.jsflow.services;

import org.springframework.stereotype.Service;

import com.proto.jsflow.domain.Cart;


@Service("declarationService")
public class DeclarationServiceImpl implements DeclarationService{
  
  public void saveCart(Cart cart) {
	  System.out.println("SAVING CART:  " );
	  System.out.println("   Customer:  " + cart.getCustomer().getName());
	  System.out.println("   Credit Card Payment:  " + cart.getCreditCardPayment());
	  System.out.println("   Cash or Check Payment:  " + cart.getCashOrCheckPayment());
  }
}
