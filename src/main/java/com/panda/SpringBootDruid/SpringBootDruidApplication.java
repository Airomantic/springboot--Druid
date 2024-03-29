package com.panda.SpringBootDruid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringBootDruidApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDruidApplication.class, args);
	}

}
