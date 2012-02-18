package com.proto.jsflow.domain;

import java.io.Serializable;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooSerializable
public abstract class Payment implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private float amount;
}
