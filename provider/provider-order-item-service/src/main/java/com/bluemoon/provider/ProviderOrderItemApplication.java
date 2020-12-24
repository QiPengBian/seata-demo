package com.bluemoon.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDiscoveryClient
@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.bluemoon.provider.mapper")
public class ProviderOrderItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderOrderItemApplication.class, args);
    }
}
