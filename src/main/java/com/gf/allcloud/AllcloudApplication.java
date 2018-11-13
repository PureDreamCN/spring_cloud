package com.gf.allcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class AllcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllcloudApplication.class, args);
    }
}
