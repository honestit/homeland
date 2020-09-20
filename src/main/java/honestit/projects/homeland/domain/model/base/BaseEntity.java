package honestit.projects.homeland.domain.model.base;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    protected Long id;
    @org.hibernate.annotations.CreationTimestamp
    @Column(name = "created_on", nullable = false, updatable = false)
    protected LocalDateTime createdOn;
    @org.hibernate.annotations.UpdateTimestamp
    @Column(name = "updated_on")
    protected LocalDateTime updatedOn;
}
