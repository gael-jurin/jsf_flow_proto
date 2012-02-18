package com.proto.jsflow.domain;

import javax.persistence.OneToOne;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEntity(identifierField = "id", table = "CUSTOMER")
public class Customer {

    private Integer id;

    private String name;

    private String address;

    private String city;

    private String zipCode;

    private String phoneNumber;
    
    @OneToOne
    private Cart cart;
}
