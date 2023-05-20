package entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Region {
    Integer id;
    String name;
}
