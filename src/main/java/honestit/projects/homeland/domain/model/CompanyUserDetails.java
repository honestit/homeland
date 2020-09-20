package honestit.projects.homeland.domain.model;

import javax.persistence.Entity;

@Entity
public class CompanyUserDetails extends UserDetails {

    private String name;
    private String nip;
    private String regon;
}
