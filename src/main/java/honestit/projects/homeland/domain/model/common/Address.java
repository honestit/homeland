package honestit.projects.homeland.domain.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Address implements Serializable {

    protected String houseNumber;
    protected String street;
    protected String postCode;
    protected String city;
}
