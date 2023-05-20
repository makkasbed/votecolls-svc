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
public class Election {
    @Id
    @SequenceGenerator(
            name = "election_id_sequence",
            sequenceName = "election_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "election_id_sequence"
    )
    Integer id;
    String name;
    String description;
}
