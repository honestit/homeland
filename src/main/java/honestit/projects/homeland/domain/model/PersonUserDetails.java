package honestit.projects.homeland.domain.model;

import javax.persistence.Entity;

@Entity
public class PersonUserDetails extends UserDetails {

    private String firstName;
    private String lastName;
    private String pesel;
    private String gender;
}
