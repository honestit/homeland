package honestit.projects.homeland.starters;

import honestit.projects.homeland.domain.model.CompanyUserDetails;
import honestit.projects.homeland.domain.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component @Profile("local")
public class LocalDataLoader {

    @PostConstruct
    public void loadData() {
        User user = new User();
        user.setDetails(new CompanyUserDetails());
    }
}
