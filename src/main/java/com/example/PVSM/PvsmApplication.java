package com.example.pvsm;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "TRAM Project",
				version = "1.0.0"
		)
)
public class PvsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PvsmApplication.class, args);
	}

}
