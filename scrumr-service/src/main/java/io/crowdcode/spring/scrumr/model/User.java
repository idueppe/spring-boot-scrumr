package io.crowdcode.spring.scrumr.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ingo Düppe (Crowdcode)
 */
@Getter
@Setter
@Accessors(chain = true)
@Slf4j
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    private String fullname;
    private Boolean admin;

}
