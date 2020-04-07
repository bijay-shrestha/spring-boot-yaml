package com.bijays.springbootyaml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication

public class SpringBootYamlApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx =
				SpringApplication.run(SpringBootYamlApplication.class, args);

		ConfigurableEnvironment env = ctx.getEnvironment();
		env.getPropertySources()
				.forEach(ps -> System.out.println(ps.getName() + " : " + ps.getClass()));

		System.out.println("Value of `server.name` = " + env.getProperty("server.name"));
		System.out.println("Value of `server.port` = " + env.getProperty("server.port"));
		System.out.println("Value of `hello.world` = " + env.getProperty("hello.world"));
		System.out.println("Value of `hello.this.is` = " + env.getProperty("hello.this.is"));
		System.out.println("Value of `spring.profiles.active` = " + env.getProperty("spring.profiles.active"));
		System.out.println("Value of `application-${spring.profiles.active}.yml`");
		System.out.println("Value of `spring.datasource.url` = " + env.getProperty("spring.datasource.url"));

	}

}
