package com.example.demo.provider.service.impl;

import com.example.demo.provider.service.ProductModifyService;
import org.springframework.stereotype.Service;

@Service
public class ProductModifyServiceImpl implements ProductModifyService {
  @Override
  public String test() {
    return "test";
  }
}
