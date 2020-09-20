@org.hibernate.annotations.GenericGenerator(
        name = "ID_GENERATOR",
        strategy = "enhanced-sequence",
        parameters = {
            @org.hibernate.annotations.Parameter(
                    name = "sequence-name",
                    value = "entities_sequences"
            )
        }
)
package honestit.projects.homeland.domain.model.base;

