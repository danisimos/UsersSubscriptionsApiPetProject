package com.orioninc;

import com.orioninc.properties.KafkaProperties;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({KafkaProperties.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
