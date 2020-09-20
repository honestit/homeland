package honestit.projects.homeland.domain.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public  class UserDetails extends BaseEntity {

    @AttributeOverrides(
            @AttributeOverride(name = "street", column = @Column(name = "home_address_street"))
    )
    private Address homeAddress;
    private Address contactAddress;

}
