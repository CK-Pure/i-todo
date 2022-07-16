package com.example.itodoserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.itodoserver.mapper")
public class ITodoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ITodoServerApplication.class, args);
	}

}
