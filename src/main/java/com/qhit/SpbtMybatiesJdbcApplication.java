package com.qhit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qhit.dao")
public class SpbtMybatiesJdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbtMybatiesJdbcApplication.class, args);
    }

}
