package com.example.fullstack.config;

import com.example.fullstack.model.Server;
import com.example.fullstack.repository.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.example.fullstack.enumeration.Status.SERVER_UP;

@Configuration
public class ServerConfig {
    @Bean
    CommandLineRunner commandLineRunner(ServerRepo serverRepo){
        return args -> {
            serverRepo.save(new Server(null, "192.160.1.160",
                    "Windows", "4GB", "Personal PC",
                    "http://localhost:8088/api/server/image/server1.png",
                    SERVER_UP));
        };
    }
}
