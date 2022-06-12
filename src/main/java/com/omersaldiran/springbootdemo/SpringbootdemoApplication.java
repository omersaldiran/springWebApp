package com.omersaldiran.springbootdemo;

import com.omersaldiran.springbootdemo.business.concretes.ProductManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
        System.out.println("Hello Spring!");

    }

}
