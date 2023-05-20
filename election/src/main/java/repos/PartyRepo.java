package repos;

import entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepo extends JpaRepository<Party,Integer> {
}
