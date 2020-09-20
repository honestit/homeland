package honestit.projects.homeland.domain.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String street;
    private String postCode;
    private String city;
}
