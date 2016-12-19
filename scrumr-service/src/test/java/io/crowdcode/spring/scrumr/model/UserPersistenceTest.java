package io.crowdcode.spring.scrumr.model;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Arrays;

import static org.junit.Assert.assertNotNull;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserPersistenceTest {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void test_1_PersistingUser() throws Exception {
        User user = new User()
                .setFullname("Ingo Düppe")
                .setPassword("masterkey")
                .setEmail("ingo.dueppe@crowdcode.io")
                .setAdmin(true);
        em.persist(user);

        assertNotNull(user.getId());
    }

    @Autowired
    private ApplicationContext context;

    @Test
    public void testPrintBeans() throws Exception {
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}