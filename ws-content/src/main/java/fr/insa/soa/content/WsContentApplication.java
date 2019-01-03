package fr.insa.soa.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"fr.insa.soa.model"} )
@EnableJpaRepositories(basePackages = {"fr.insa.soa.model.repository"} )
@SpringBootApplication
public class WsContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(WsContentApplication.class, args);
    }

}

