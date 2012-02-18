package com.proto.jsflow.domain;

import java.util.Arrays;
import java.util.List;


public enum PaymentType {

    CASH, CHEQUE, CREDIT_CARD;
    
    public static List<PaymentType> asList() {
    	
		PaymentType[] all = PaymentType.values();
		return Arrays.asList(all);
	}
    
    public static PaymentType[] asArray() {
    	
		PaymentType[] all = PaymentType.values();
		return all;
	}
	
	@Override
	public String toString() {
		return name().replace('_', ' ');
	}
}
