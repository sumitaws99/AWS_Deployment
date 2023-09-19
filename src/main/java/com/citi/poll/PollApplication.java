package com.citi.poll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/name")
public class PollApplication {

	@GetMapping("/name1")
	public String getName(){
		return "sumit";
	}

	public static void main(String[] args) {
		SpringApplication.run(PollApplication.class, args);
	}

}
