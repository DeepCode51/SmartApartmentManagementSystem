package com.family;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.family.mapper")
public class SpringbootFamilytestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFamilytestApplication.class, args);
    }

}
