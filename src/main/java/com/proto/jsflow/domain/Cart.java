package com.proto.jsflow.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.serializable.RooSerializable;
import org.springframework.roo.addon.tostring.RooToString;
import com.proto.jsflow.domain.Customer;
import javax.persistence.ManyToOne;
import com.proto.jsflow.domain.Payment;
import java.util.Set;
import com.proto.jsflow.domain.Article;
import java.util.HashSet;
import javax.persistence.ManyToMany;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@RooJavaBean
@RooToString
@RooEntity
@RooSerializable
public class Cart {

    @OneToOne
    private Customer customer;

    @OneToOne
    private CreditCardPayment creditCardPayment;
    
    @OneToOne
    private CashOrCheckPayment cashOrCheckPayment;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Article> articles = new HashSet<Article>();

    private float total;
}
