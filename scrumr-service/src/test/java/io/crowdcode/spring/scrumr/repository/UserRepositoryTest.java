package io.crowdcode.spring.scrumr.repository;

import io.crowdcode.spring.scrumr.model.User;
import io.crowdcode.spring.scrumr.model.UserFixture;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void test_1_createUser() throws Exception {
        User admin = UserFixture.defaultAdmin();
        userRepository.save(admin);
        assertNotNull(admin.getId());
    }
}