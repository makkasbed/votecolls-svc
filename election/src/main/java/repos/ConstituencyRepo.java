package repos;

import entities.Constituency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConstituencyRepo extends JpaRepository<Constituency,Integer> {
}
