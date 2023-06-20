package repos;

import entities.Constituency;
import entities.PollDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollDetailRepo extends JpaRepository<PollDetail,Integer> {
}
