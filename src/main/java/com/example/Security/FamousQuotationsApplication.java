package com.example.Security;

import com.example.Security.config.SwaggerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class FamousQuotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamousQuotationsApplication.class, args);
	}

}
