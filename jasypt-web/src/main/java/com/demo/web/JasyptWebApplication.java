package com.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
@ComponentScan(basePackages = "com.demo")
public class JasyptWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(JasyptWebApplication.class, args);
    }
}