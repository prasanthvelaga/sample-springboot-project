package com.business;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BusinessProjectApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(BusinessProjectApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BusinessProjectApplication.class, args);
    }
}
