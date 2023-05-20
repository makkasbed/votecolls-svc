package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PollingStation {
    Integer id;
    String name;
    Integer constituencyId;
}
