package com.java.restservice;

import com.java.restservice.entity.User;
import com.java.restservice.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    protected CommandLineRunner init(final UserRepository userRepository) {
//
//        return args -> {
//            User user = new User();
//            user.setUsername("admin");
//            user.setPassword("admin");
//            user.setLastName("Stolpovskiy");
//            user.setName("Nikita");
//            user.setEmail("snv199817@gmail.com");
//            userRepository.save(user);
//
//        };
//    }
}