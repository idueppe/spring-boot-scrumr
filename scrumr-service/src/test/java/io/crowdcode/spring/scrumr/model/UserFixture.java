package io.crowdcode.spring.scrumr.model;

/**
 * @author Ingo Düppe (Crowdcode)
 */
public class UserFixture {

    public static User defaultUser() {
        return new User()
                .setFullname("Default User")
                .setEmail("default@scrumr.crowdcode.io")
                .setPassword("masterkey")
                .setAdmin(false);
    }

    public static User defaultAdmin() {
        return new User()
                .setFullname("Default Admin")
                .setEmail("admin@scrumr.crowdcode.io")
                .setPassword("test1234")
                .setAdmin(true);
    }
}
