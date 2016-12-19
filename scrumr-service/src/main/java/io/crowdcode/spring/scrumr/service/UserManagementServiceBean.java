package io.crowdcode.spring.scrumr.service;

/**
 * @author Ingo Düppe (Crowdcode)
 */

import io.crowdcode.spring.scrumr.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class UserManagementServiceBean implements UserManagementService {

    private static final Logger log = LoggerFactory.getLogger(UserManagementServiceBean.class);

    public UserManagementServiceBean() {
        log.info("Creating UserManagementServiceBean");
    }

    @Override
    public String registerUser(String email, String name, String password, boolean isAdmin) {
        return null;
    }

    @Override
    public void removeUser(String email) {

    }

    @Override
    public void updateUser(String id, String name, String password, String email, boolean isAdmin) {

    }

    @Override
    public List<User> getUserList() {
        return null;
    }

    @Override
    public User getUserById(String email) {
        return null;
    }
}
