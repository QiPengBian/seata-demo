package com.bluemoon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProviderTransactionApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderTransactionApplication.class, args);
    }
}
