package io.crowdcode.spring.scrumr.config;

import io.crowdcode.spring.scrumr.repository.UserRepository;
import io.crowdcode.spring.scrumr.service.UserManagementService;
import io.crowdcode.spring.scrumr.service.UserManagementServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@Configuration
public class ScrumrConfig {

    @Bean()
    public UserManagementService userManagementService(UserRepository userRepository) {
        return new UserManagementServiceBean(userRepository);
    }

}
