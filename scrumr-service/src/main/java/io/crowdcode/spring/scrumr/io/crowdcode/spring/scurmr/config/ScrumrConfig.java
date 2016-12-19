package io.crowdcode.spring.scrumr.io.crowdcode.spring.scurmr.config;

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
    public UserManagementService userManagementService() {
        return new UserManagementServiceBean();
    }

}
