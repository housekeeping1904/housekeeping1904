package com.soft.housekeeping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan(basePackages = "com.soft.housekeeping.mapper")
public class HousekeepingApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(HousekeepingApplication.class, args);
	}

}
