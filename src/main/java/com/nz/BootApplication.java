package com.nz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-shiro.xml"})
public class BootApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class,args);
        System.out.println("ShellApplication is sucess!");
    }
}
