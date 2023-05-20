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
public class Region {
    @Id
    @SequenceGenerator(
            name = "region_id_sequence",
            sequenceName = "region_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "region_id_sequence"
    )
    Integer id;
    String name;
}
