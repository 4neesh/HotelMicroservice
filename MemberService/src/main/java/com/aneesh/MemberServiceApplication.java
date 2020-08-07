package com.aneesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class MemberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/member/{cid}")
	public @ResponseBody String getMember(@PathVariable Integer cid) {
		
		ResponseEntity<String> customerDetail = template.getForEntity("http://localhost:8883/get/1", String.class);
		ResponseEntity<String> memberDetail = template.getForEntity("http://localhost:8884/get/22", String.class);

		return customerDetail.getBody() + "|" + memberDetail.getBody();
	}
}
