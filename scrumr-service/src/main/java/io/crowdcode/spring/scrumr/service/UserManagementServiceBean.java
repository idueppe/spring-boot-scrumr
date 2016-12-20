package io.crowdcode.spring.scrumr.service;

/**
 * @author Ingo Düppe (Crowdcode)
 */

import io.crowdcode.spring.scrumr.model.User;
import io.crowdcode.spring.scrumr.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Transactional
public class UserManagementServiceBean implements UserManagementService {

    private UserRepository userRepository;

    public UserManagementServiceBean() {
        log.info("Creating UserManagementServiceBean");
    }

    public UserManagementServiceBean(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String registerUser(String email, String name, String password, boolean isAdmin) {
        User user = new User()
                .setEmail(email)
                .setFullname(name)
                .setPassword(password)
                .setAdmin(isAdmin);

        userRepository.save(user);

        return user.getEmail();
    }

    @Override
    public void removeUser(String email) {
        userRepository.deleteByEmail(email);
    }

    @Override
    public void updateUser(String name, String password, String email, boolean isAdmin) {
        User user = getUserByEmail(email);
        user.setFullname(name).setPassword(password).setAdmin(isAdmin);
        // ??
    }

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }


}
