package com.example.demo.consumer.config.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "provider-service")
public interface ProviderClient {

  @GetMapping("/product/test")
  String test();
}
