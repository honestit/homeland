package honestit.projects.homeland.domain.model;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cars")
public class Car extends BaseEntity {

    @ManyToOne
    private User owner;
    private CarDetails details;
    @CollectionTable(name = "cars_comments")
    private List<String> comments;
}
