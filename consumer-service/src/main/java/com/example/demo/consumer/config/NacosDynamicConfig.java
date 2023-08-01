package com.example.demo.consumer.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@RefreshScope
@Configuration
@Getter
public class NacosDynamicConfig {
  @Value("${config.str:null}")
  private String configStr;
}
