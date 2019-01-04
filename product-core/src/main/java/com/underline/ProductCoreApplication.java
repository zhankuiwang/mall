package com.underline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.underline.mapper")
//如果您不想使用@SpringBootApplication，它导入的@EnableAutoConfiguration 和@ComponentScan

public class ProductCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCoreApplication.class, args);
    }

}
