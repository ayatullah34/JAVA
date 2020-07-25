
package com.springdemo;

//XML KULLANMADAN CLASS YAPISIYLA ALTERNATÝF OLUÞTURDUK

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.springdemo")
@PropertySource("classpath:Values.properties")

public class IoCConfig {
	@Bean
	public ICustomerDal database() {
		return new MySqlCustomerDal();
	}

	@Bean
	public ICustomerService service() {
		return new CustomerManager(database());
	}

	
}
