package com.bw.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lenovo on 2017/7/22.
 */

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaConsumerApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
     return new RestTemplate();
     }

     public static void main(String[] args) {
     SpringApplication.run(EurekaConsumerApplication.class, args);
     }


}
