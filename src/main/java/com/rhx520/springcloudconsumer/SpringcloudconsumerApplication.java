package com.rhx520.springcloudconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconsumerApplication.class, args);
    }
}
