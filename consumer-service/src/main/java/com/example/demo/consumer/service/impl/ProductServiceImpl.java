package com.example.demo.consumer.service.impl;

import com.example.demo.consumer.config.client.ProviderClient;
import com.example.demo.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

  @Autowired private ProviderClient providerClient;

  @Override
  public String testApi() {
    String s = "consumer string";
    return s + providerClient.test();
  }
}
