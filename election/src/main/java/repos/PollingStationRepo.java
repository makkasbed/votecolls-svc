package repos;

import entities.PollingStation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollingStationRepo extends JpaRepository<PollingStation,Integer> {
}
