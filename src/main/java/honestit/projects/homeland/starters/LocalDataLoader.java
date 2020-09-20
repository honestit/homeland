package honestit.projects.homeland.starters;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component @Profile("local")
public class LocalDataLoader {

    @PostConstruct
    public void loadData() {

    }
}
