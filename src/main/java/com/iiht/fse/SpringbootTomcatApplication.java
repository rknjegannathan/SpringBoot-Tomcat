package com.iiht.fse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.iiht.fse")
public class SpringbootTomcatApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTomcatApplication.class, args);
	}

}
