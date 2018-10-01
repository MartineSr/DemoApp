package demo.app;

import demo.app.service.UserRepo;
import demo.app.service.UserRepoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public UserRepo userRepo(){
        return new UserRepoImpl();
    }
}
