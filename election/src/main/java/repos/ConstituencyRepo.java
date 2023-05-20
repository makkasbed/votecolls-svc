package repos;

import entities.Constituency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstituencyRepo extends JpaRepository<Constituency,Integer> {
}
