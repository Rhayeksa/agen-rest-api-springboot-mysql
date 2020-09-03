
package com.agenCanggih;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class AgenCanggihApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgenCanggihApplication.class, args);
	}

	@GetMapping("/angga-ganteng")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}
