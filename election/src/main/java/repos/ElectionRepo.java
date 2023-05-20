package repos;

import entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectionRepo extends JpaRepository<Election,Integer> {
}
