package honestit.projects.homeland.domain.model.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data @Embeddable
@NoArgsConstructor @AllArgsConstructor
public class UserDetails implements Serializable {

    @Column(name = "first_name")
    protected String firstName;
    @Column(name = "last_name")
    protected String lastName;
    @Column(unique = true)
    protected String email;
}
