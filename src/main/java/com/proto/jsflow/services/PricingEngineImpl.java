package com.proto.jsflow.services;

import org.springframework.stereotype.Service;

import com.proto.jsflow.domain.Article;
import com.proto.jsflow.domain.Cart;


@Service("pricingEngine")
public class PricingEngineImpl implements PricingEngine {
  
 
  public float calculateOrderTotal(Cart cart) {
	System.out.println("Calculating declaration amount");
    
	
    float total = 0;
    
    for (Article article: cart.getArticles()){
    	total += article.getPrice() * article.getQty();
    }
    
    return total;
    
  }
}
