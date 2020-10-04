package honestit.projects.homeland;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileSystemUtils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@SpringBootApplication
public class HomelandApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(HomelandApplication.class, args);
    }

}
