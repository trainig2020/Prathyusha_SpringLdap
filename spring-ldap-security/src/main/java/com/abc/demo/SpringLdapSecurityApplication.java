package com.abc.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SpringLdapSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLdapSecurityApplication.class, args);
	}

}
