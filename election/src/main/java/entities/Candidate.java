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
public class Candidate {
    @Id
    @SequenceGenerator(
            name = "candidate_id_sequence",
            sequenceName = "candidate_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "candidate_id_sequence"
    )
    Integer id;
    String name;
    String photo;
}
