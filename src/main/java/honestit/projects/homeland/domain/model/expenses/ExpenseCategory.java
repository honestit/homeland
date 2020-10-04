package honestit.projects.homeland.domain.model.expenses;

import honestit.projects.homeland.domain.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "expense_categories")
@Getter @Setter @ToString(exclude = "parent", callSuper = true)
public class ExpenseCategory extends BaseEntity {

    @Column(nullable = false)
    private String name;
    @ManyToOne(optional = true)
    private ExpenseCategory parent;
}
