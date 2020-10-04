package honestit.projects.homeland.domain.model.expenses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class Money implements Serializable {

    @Column(nullable = true, precision = 9, scale = 2)
    protected Double value;
    @Column(nullable = true)
    protected String currency;
}
