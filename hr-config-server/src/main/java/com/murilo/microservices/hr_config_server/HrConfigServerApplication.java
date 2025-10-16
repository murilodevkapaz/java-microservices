package com.murilo.microservices.hr_config_server;

import org.springframework.beans.factory.annotation.Value; // Adicione esta linha
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HrConfigServerApplication implements CommandLineRunner {

    @Value("${spring.cloud.config.server.git.username:}")
    private String username;

    @Value("${spring.cloud.config.server.git.password:}")
    private String password;

    public static void main(String[] args) {
        SpringApplication.run(HrConfigServerApplication.class, args);
    }

    @Override // Boa prática adicionar a anotação Override
    public void run(String... args) throws Exception {
        System.out.println("USERNAME: " + username + " PASS: " + password);
    }
}