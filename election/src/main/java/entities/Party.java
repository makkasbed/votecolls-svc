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
public class Party {
    @Id
    @SequenceGenerator(
            name = "party_id_sequence",
            sequenceName = "party_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "party_id_sequence"
    )
    Integer id;
    String name;
    String logo;
}
