package honestit.projects.homeland.domain.model;

import javax.persistence.Embeddable;

@Embeddable
public class CarDetails {

    private String vin;
    private String type;
    private String yearOfProduction;
}
