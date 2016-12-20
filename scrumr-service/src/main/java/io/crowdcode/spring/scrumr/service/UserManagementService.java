package io.crowdcode.spring.scrumr.service;

import io.crowdcode.spring.scrumr.model.User;

import java.util.List;

/**
 * @author Ingo Düppe (Crowdcode)
 */
public interface UserManagementService {
    public String registerUser(String email, String name, String password, boolean isAdmin);
    public void removeUser(String email);
    public void updateUser(String name, String password, String email, boolean isAdmin);
    public List<User> getUserList();
    public User getUserByEmail(String email);
}