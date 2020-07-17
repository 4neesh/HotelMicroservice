package com.aneesh;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CustomerTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerTaskApplication.class, args);
	}
	
	@Bean
	RegisterCustomer registerCustomer() {
		return new RegisterCustomer();
	}
	
	public class RegisterCustomer implements CommandLineRunner{

		@Override
		public void run(String... args) throws Exception {
			
			if(null != args) {
			String customerName = args[0];
			Integer customerAge = Integer.parseInt(args[1]);
			String customerRoom = args[2];
			Customer customer = new Customer(customerName, customerRoom, customerAge);
			
			System.out.println("Customer details: " + customer);
			}
					
		}
		
	}

}
