package com.aneesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MemberServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApplication.class, args);
	}
	
	@Autowired
	RestTemplate template;
	
	@GetMapping("/member/{cid}")
	public @ResponseBody String getMember(@PathVariable Integer cid) {
		
		ResponseEntity<String> customerDetail = template.getForEntity("localhost:8883/", String.class);
		ResponseEntity<String> memberDetail = template.getForEntity("", String.class);

		return customerDetail + "|" + memberDetail;
	}
}
