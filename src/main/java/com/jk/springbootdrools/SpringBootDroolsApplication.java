package com.jk.springbootdrools;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jk"})
public class SpringBootDroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDroolsApplication.class, args);
	}

}
