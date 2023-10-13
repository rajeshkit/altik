package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Beans {
    @Bean
   public RestTemplate restTemplate(){
       return  new RestTemplate();
   }
    @Bean
    public Payment payment(){
        return new Payment();
    }
    @Bean
    public Bill bill(){
        Bill b = new Bill(payment());
        return b;
    }
}
