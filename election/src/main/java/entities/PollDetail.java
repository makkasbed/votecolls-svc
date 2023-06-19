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
public class PollDetail {
    @Id
    @SequenceGenerator(
            name = "poll_detail_id_sequence",
            sequenceName = "poll_detail_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "poll_detail_id_sequence"
    )
    Integer id;
    Integer pollId;
    Integer partyId;
    Integer candidateId;
    String createdAt;
    String updatedAt;

}
