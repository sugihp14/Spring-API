package SpringRestAPI.SpringRestAPI.repositories;

import SpringRestAPI.SpringRestAPI.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findFirstByToken(String token);

}
