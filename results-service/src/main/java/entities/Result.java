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
public class Result {
    @Id
    @SequenceGenerator(
            name = "result_id_sequence",
            sequenceName = "result_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "result_id_sequence"
    )
    Integer id;
    //the polling station ID
    Integer pollingId;
    //the date the poll was uploaded
    String createdAt;
    //the date the poll was updated
    String updatedAt;
    //the base64 encoding of the poll
    String pinkSheet;
    // the total number of votes
    int totalVotes;
    // total number of valid votes cast
    int totalValidVotes;
    // total number of rejected votes
    int totalRejectedVotes;

}
