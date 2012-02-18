package com.proto.jsflow.services;

import com.proto.jsflow.domain.Cart;

public interface PricingEngine {
  public float calculateOrderTotal(Cart cart);
}
