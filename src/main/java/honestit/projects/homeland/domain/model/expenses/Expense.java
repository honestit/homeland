package honestit.projects.homeland.domain.model.expenses;

import honestit.projects.homeland.domain.model.apartment.Apartment;
import honestit.projects.homeland.domain.model.apartment.Room;
import honestit.projects.homeland.domain.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "expenses")
@Getter @Setter @ToString(exclude = {"apartment", "rooms", "category"}, callSuper = true)
public class Expense extends BaseEntity {

    @Embedded
    protected Money value;
    @Column(name = "expense_date", nullable = false)
    protected LocalDateTime expenseDate;
    @Column(name = "short_description", nullable = false)
    protected String shortDescription;
    @Column(name = "full_description")
    protected String fullDescription;

    @ManyToOne(optional = false)
    protected Apartment apartment;

    @ManyToMany
    protected Set<Room> rooms;

    @ManyToOne(optional = false)
    protected ExpenseCategory category;
}
