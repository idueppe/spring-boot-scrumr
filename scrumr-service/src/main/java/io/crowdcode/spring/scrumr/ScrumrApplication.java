package io.crowdcode.spring.scrumr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@SpringBootApplication
public class ScrumrApplication {

    public static void main(String[] args) {
        System.out.println("Starting Spring Boot...");
        SpringApplication.run(ScrumrApplication.class, args);
    }

}
