package guru.springframework.joke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class ChucknorrisjokesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChucknorrisjokesApplication.class, args);
    }

}
