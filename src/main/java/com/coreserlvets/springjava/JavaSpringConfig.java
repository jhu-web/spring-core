package com.coreserlvets.springjava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.coreservlets.springjava" })
public class JavaSpringConfig {

	@Bean
	public BookSupplier getBookSupplier() {
		// See if test sys prop equal to true; return test supplier
		String testProp = System.getProperty("testProp");
		if (testProp != null && testProp.equalsIgnoreCase("true")) {
			return new TestBookSupplier();
		}

		return new SafariBookSupplier();
	}

	@Bean
	public BookStoreService getBookStoreService() {
		return new BookStoreServiceImpl();
	}
}
