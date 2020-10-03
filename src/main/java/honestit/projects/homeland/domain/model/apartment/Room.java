package honestit.projects.homeland.domain.model.apartment;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class Room implements Serializable {

    @Column(nullable = false)
    private String name;
    @Column(nullable = false, scale = 5, precision = 2)
    private Double area;
    @Column(scale = 5, precision = 2)
    private Double circuit;
    @Column(scale = 5, precision = 2)
    private Double height;

}
