package io.crowdcode.spring.scrumr.service;

import io.crowdcode.spring.scrumr.model.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserManagementServiceBeanTest {

    public static final String JUNIT_MAIL = "junit@crowdcode.io";

    @Autowired
    private UserManagementService service;

    @Test
    public void test_1_Register() throws Exception {
        String mail = service.registerUser("junit@crowdcode.io", "junit", "password", false);
        assertThat(mail, is(JUNIT_MAIL));
    }

    @Test
    public void test_2_Update() throws Exception {
        service.updateUser("junit update", "password", JUNIT_MAIL, false );
        User user = service.getUserByEmail(JUNIT_MAIL);
        assertThat(user.getFullname(), is ("junit update"));
    }

    @Test
    public void test_3_delete() throws Exception {
        service.removeUser(JUNIT_MAIL);
        service.getUserByEmail(JUNIT_MAIL);

    }
}