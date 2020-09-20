package honestit.projects.homeland.domain.repositories;

import honestit.projects.homeland.domain.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getByUsername(String username);
}
