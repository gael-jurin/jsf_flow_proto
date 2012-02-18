package com.proto.jsflow.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;
import com.proto.jsflow.domain.PaymentType;

@RooJavaBean
@RooToString
@RooEntity
@RooSerializable
public class PaymentDetails {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PaymentType paymentType;

    private String creditCardNumber;
}
