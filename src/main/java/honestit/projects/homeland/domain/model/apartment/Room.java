package honestit.projects.homeland.domain.model.apartment;

import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
public class Room implements Serializable {

    @Column(nullable = false)
    protected String name;
    @Column(nullable = false, scale = 5, precision = 2)
    protected Double area;
    @Column(scale = 5, precision = 2)
    protected Double circuit;
    @Column(scale = 5, precision = 2)
    protected Double height;

}
