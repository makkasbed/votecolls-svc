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
public class ResultDetail {
    @Id
    @SequenceGenerator(
            name = "result_detail_id_sequence",
            sequenceName = "result_detail_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "result__detail_id_sequence"
    )
    Integer id;
    String candidateId;
    int numVotes;
    String createdAt;
    String updatedAt;
}
