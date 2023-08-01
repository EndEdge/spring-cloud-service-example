package com.example.demo.provider.controller;

import com.example.demo.provider.service.ProductModifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductModifyController {

  @Autowired private ProductModifyService productModifyService;

  @GetMapping("/test")
  public String test() {
    return productModifyService.test();
  }
}
