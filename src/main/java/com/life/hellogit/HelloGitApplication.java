package com.life.hellogit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.life.hellogit.mapper")
public class HelloGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloGitApplication.class, args);
    }

}
