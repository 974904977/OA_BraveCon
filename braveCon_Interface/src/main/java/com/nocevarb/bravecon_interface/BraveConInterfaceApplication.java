package com.nocevarb.bravecon_interface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.nocevarb.bravecon_interface.mapper")
//@MapperScan("com.sdyu.catmanage.mapper.LogsMapper")
public class BraveConInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BraveConInterfaceApplication.class, args);
	}

}
