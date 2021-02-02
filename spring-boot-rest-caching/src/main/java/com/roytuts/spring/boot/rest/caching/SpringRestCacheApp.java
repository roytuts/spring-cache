package com.roytuts.spring.boot.rest.caching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@EntityScan("com.roytuts.spring.boot.rest.caching.entity")
@EnableJpaRepositories("com.roytuts.spring.boot.rest.caching.repository")
@SpringBootApplication(scanBasePackages = "com.roytuts.spring.boot.rest.caching")
public class SpringRestCacheApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestCacheApp.class, args);
	}

}
