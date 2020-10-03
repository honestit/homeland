package honestit.projects.homeland.domain.model.user;

import honestit.projects.homeland.domain.model.base.BaseEntity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "users")
@Getter @Setter @ToString(exclude = "password", callSuper = true)
@EqualsAndHashCode(of = "username", callSuper = false)
public class User extends BaseEntity {

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Column(nullable = false, unique = true)
    protected String username;
    @Column(nullable = false)
    protected String password;

    @CollectionTable(name = "user_roles",
        joinColumns = @JoinColumn(name = "username", referencedColumnName = "username")
    )
    @ElementCollection
    protected Set<String> roles = new HashSet<>();

    protected UserDetails details = new UserDetails();

}
