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
public class Poll {
    @Id
    @SequenceGenerator(
            name = "poll_id_sequence",
            sequenceName = "poll_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "poll_id_sequence"
    )
    Integer id;
    Integer electionId;
    String createdAt;
    String updatedAt;
    String status;
    Integer constituencyId;
}
