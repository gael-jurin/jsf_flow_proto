package com.proto.jsflow.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity
public class CashOrCheckPayment extends Payment {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString() {
		    return "CASH or CHECK:  $" + getAmount();
	}
}
