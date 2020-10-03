package honestit.projects.homeland.domain.model.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Address implements Serializable {

    private String houseNumber;
    private String street;
    private String postCode;
    private String city;
}
