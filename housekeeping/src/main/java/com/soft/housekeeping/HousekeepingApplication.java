package com.soft.housekeeping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.soft.housekeeping.mapper")
public class HousekeepingApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(HousekeepingApplication.class, args);
	}

}
