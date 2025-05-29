package com.example.userms;

import com.example.userms.Entity.User;
import com.example.userms.Repository.UserRepositor;

import lombok.Builder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.UUID;

@SpringBootApplication
public class UserMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMsApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(UserRepositor userRepository){
        return args -> {
            User user1 = User.builder()
                    .userId(UUID.randomUUID())
                    .name("Ahmed El Amrani")
                    .email("ahmed.amrani@example.com")
                    .phoneNumber("+212 6 12 34 56 78")
                    .role("Bénévole")
                    .address("45 Avenue des Forces Armées Royales, Casablanca")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .build();

            User user2 = User.builder()
                    .userId(UUID.randomUUID())
                    .name("Fatima Zahra Benali")
                    .email("fatima.benali@example.com")
                    .phoneNumber("+212 6 87 65 43 21")
                    .role("Donateur")
                    .address("123 Rue des Jardins, Marrakech")
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .build();

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.findAll().forEach(user -> {
                System.out.println("++++++++++++++++++++++++++++");
                System.out.println(user.getUserId());
                System.out.println(user.getName());
                System.out.println(user.getEmail());

            });
    };
}}
