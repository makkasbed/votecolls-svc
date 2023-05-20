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
public class Constituency {
    @Id
    @SequenceGenerator(
            name = "constituency_id_sequence",
            sequenceName = "constituency_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "constituency_id_sequence"
    )
    Integer id;
    String name;
    Integer region;
}
