package repos;

import entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultsRepo extends JpaRepository<Result,Integer> {
}
