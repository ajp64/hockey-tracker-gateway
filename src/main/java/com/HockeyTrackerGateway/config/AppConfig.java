package com.HockeyTrackerGateway.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.HockeyTrackerGateway.proxy")
@ComponentScan(basePackages = {"proxy", "model", "controllers"})
public class AppConfig {
}
