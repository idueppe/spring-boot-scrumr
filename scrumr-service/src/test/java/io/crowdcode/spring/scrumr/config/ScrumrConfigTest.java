package io.crowdcode.spring.scrumr.config;

import io.crowdcode.spring.scrumr.service.UserManagementService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

/**
 * @author Ingo Düppe (Crowdcode)
 */
public class ScrumrConfigTest {

//    @Autowired
//    private ApplicationContext applicationContext;

    @Test
    public void testSpringContext() throws Exception {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ScrumrConfig.class);

        UserManagementService bean = context.getBean(UserManagementService.class);

        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(">"+name);
        }


        Arrays.stream(context
                .getBeanDefinitionNames())
                    .forEach(n -> {
                        String type = context.getType(n).getCanonicalName();
                        System.out.println(">>>> "+n+":"+type);

                    });

        assertNotNull(bean);
    }


}