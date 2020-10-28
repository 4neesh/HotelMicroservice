package com.aneesh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import brave.Span;
import brave.Tracer;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class MemberServiceApplication {

	
	
	public static void main(String[] args) {
		SpringApplication.run(MemberServiceApplication.class, args);
	}
	
//	private static Logger log = LoggerFactory.getLogger(MemberServiceApplication.class);
	
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	
//	@Autowired
//	Tracer tracer;
//	
//	@Autowired
//	RestTemplate template;
	
	@GetMapping("/test")
	public String getter() {
		return "lo";
	}
	
	@GetMapping("/member/{cid}")
	public @ResponseBody String getMember(@PathVariable Integer cid) {
		
//		Span span = tracer.currentSpan().name("MemberServiceSpan").start();
//		
//		log.info("Get Request");
//		try {
//			span.tag("requestID", Integer.toString(cid));
//			
//		}
//		finally {
//			span.finish();
//		}
		//ResponseEntity<String> customerDetail = template.getForEntity("http://localhost:8883/get/1", String.class);

		
		return "test";
	}
	
	
}
