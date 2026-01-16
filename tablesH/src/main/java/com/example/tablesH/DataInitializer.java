package com.example.tablesH;

import com.example.tablesH.entity.Person;
import com.example.tablesH.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final PersonRepository personRepository;

    public DataInitializer(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        personRepository.save(new Person("Ivan", "Ivanov", "Moscow", 25));
        personRepository.save(new Person("Petr", "Petrov", "Moscow", 35));
        personRepository.save(new Person("Anna", "Sidorova", "Kazan", 28));
    }
}