package vip.example.springjenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringjenkinsApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringjenkinsApplication.class);
			
	@PostConstruct
	public void init() {
		logger.info("App Started..... (1)");
	}

	public static void main(String[] args) {
		logger.info("Application Executed...... (2)");
		SpringApplication.run(SpringjenkinsApplication.class, args);
	}

}
