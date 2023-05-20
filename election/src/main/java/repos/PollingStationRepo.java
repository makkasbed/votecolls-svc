package repos;

import entities.PollingStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollingStationRepo extends JpaRepository<PollingStation,Integer> {
}
