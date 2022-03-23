package site.metacoding.searchprogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SearchprogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchprogramApplication.class, args);
	}

}
