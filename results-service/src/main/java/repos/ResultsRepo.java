package repos;

import entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultsRepo extends JpaRepository<Result,Integer> {
    public List<Result> findByElectionId(Integer id);
}
