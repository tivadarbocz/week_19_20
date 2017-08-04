package hu.helixlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("hu.helixlab")
public class Week19SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Week19SpringbootApplication.class, args);
	}
}
