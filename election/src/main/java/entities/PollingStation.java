package entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class PollingStation {
    @Id
    @SequenceGenerator(
            name = "polling_station_id_sequence",
            sequenceName = "polling_station_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "polling_station_id_sequence"
    )
    Integer id;
    String name;
    Integer constituencyId;
}
