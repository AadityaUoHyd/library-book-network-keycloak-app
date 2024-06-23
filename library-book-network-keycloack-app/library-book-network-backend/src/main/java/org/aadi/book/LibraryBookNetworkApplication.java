package org.aadi.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableAsync
@SpringBootApplication
public class LibraryBookNetworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBookNetworkApplication.class, args);
	}

}
