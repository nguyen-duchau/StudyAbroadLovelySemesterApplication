package fr.insa.soa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"fr.insa.soa.model"} )
@EnableJpaRepositories(basePackages = {"fr.insa.soa.model.repository"} )
@SpringBootApplication
public class SalsaWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalsaWebappApplication.class, args);
	}
}
