package com.example.tablesH;


import com.example.tablesH.entity.User;
import com.example.tablesH.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataInitializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.entityManager.persist(new User("Ivan", "Moscow"));
        userRepository.entityManager.persist(new User("Sergey", "Saint-Petersburg"));
        userRepository.entityManager.persist(new User("Anna", "Moscow"));
        userRepository.entityManager.persist(new User("Oleg", "Kiev"));

    }
}