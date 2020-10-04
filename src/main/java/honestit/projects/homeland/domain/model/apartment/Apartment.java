package honestit.projects.homeland.domain.model.apartment;

import honestit.projects.homeland.domain.model.base.BaseEntity;
import honestit.projects.homeland.domain.model.common.Address;
import honestit.projects.homeland.domain.model.user.User;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "apartments")
@SecondaryTable(name = "apartment_details",
        pkJoinColumns = @PrimaryKeyJoinColumn)
@Getter @Setter @ToString(exclude = "owners") @EqualsAndHashCode(of = {"name", "address"}, callSuper = false)
public class Apartment extends BaseEntity {

    public Apartment() {}

    public Apartment(String name, String street, String postCode, String city) {
        this.name = name;
        this.address = new Address(null, street, postCode, city);
    }

    @Column(nullable = false)
    protected String name;

    @AttributeOverride(
            name = "description",
            column = @Column(table = "apartment_details")
    )
    protected ApartmentDetails apartmentDetails = new ApartmentDetails();

    @AttributeOverrides({
            @AttributeOverride(
                    name = "houseNumber",
                    column = @Column(name = "apartment_number")
            ),
            @AttributeOverride(
                    name = "street",
                    column = @Column(name = "apartment_street", nullable = false)
            ),
            @AttributeOverride(
                    name = "postCode",
                    column = @Column(name = "apartment_post_code", nullable = false)
            ),
            @AttributeOverride(
                    name = "city",
                    column = @Column(name = "apartment_city", nullable = false)
            )
    })
    protected Address address = new Address();

    @ManyToMany
    @JoinTable(name = "apartment_owners",
            inverseJoinColumns = {
                    @JoinColumn(name = "owner_id", referencedColumnName = "id"),
                    @JoinColumn(name = "owner_username", referencedColumnName = "username")
            },
            joinColumns = @JoinColumn(name = "apartment_id", referencedColumnName = "id")
    )
    protected Set<User> owners = new HashSet<>();

    @CollectionTable(name = "apartment_rooms")
    @ElementCollection
    protected Set<Room> rooms = new HashSet<>();

}
