package repos;

import entities.Election;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectionRepo extends JpaRepository<Election,Integer> {
}
