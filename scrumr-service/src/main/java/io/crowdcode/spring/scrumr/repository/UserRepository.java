package io.crowdcode.spring.scrumr.repository;

import io.crowdcode.spring.scrumr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ingo Düppe (Crowdcode)
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
