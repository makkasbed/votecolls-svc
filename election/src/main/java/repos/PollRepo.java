package repos;

import entities.Constituency;
import entities.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PollRepo extends JpaRepository<Poll,Integer> {
    public List<Poll> findByElectionId(Integer id);
    public List<Poll> findByConstituencyId(Integer id);
}
