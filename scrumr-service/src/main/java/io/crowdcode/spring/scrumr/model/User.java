package io.crowdcode.spring.scrumr.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@Getter
@Setter
@Accessors(chain = true)
@Slf4j
public class User {

    private Long id;
    private String email;
    private String password;
    private String fullname;
    private Boolean admin;


}
