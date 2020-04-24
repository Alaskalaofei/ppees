package com.csdj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.csdj.mapper"})
public class PpeesWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpeesWebApplication.class, args);
    }

}
