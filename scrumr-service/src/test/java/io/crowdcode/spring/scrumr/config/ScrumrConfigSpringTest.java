package io.crowdcode.spring.scrumr.config;

import io.crowdcode.spring.scrumr.io.crowdcode.spring.scurmr.config.ScrumrConfig;
import io.crowdcode.spring.scrumr.service.UserManagementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={ScrumrConfig.class})
public class ScrumrConfigSpringTest {

    @Autowired
    private UserManagementService bean;

    @Test
    public void testBean() throws Exception {
        assertNotNull(bean);
    }
}