package fr.insa.soa.consumer;

import fr.insa.soa.model.entities.Staff;
import fr.insa.soa.model.repository.AccountRepository;
import fr.insa.soa.model.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
class LoadDatabase {

	@Bean
	CommandLineRunner initDatabase(AccountRepository accountRepository, CourseRepository courseRepository) {

		return args -> {
			log.info("Preloading " + accountRepository.save(new Staff("username1", "password")));
			log.info("Preloading " + accountRepository.save(new Staff("username2", "password")));
			//log.info("Test class: " + courseRepository.save(new Course("IF1457", "Maths")));
		};
	}
}
