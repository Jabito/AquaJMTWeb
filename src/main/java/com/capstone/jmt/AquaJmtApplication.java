package com.capstone.jmt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jabito on 01/02/2017.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AquaJmtApplication {

    public static void main(String[] args) {
        SpringApplication.run(AquaJmtApplication.class, args);
    }
}
