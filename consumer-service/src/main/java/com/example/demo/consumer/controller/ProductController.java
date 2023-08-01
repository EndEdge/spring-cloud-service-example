package com.example.demo.consumer.controller;

import com.example.demo.consumer.config.NacosDynamicConfig;
import com.example.demo.consumer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class ProductController {

  @Autowired private ProductService productService;

  @Autowired private NacosDynamicConfig nacosDynamicConfig;

  @GetMapping("/test")
  public String test() {
    return productService.testApi();
  }

  @GetMapping("/config")
  public String getConfig() {
    return nacosDynamicConfig.getConfigStr();
  }
}
