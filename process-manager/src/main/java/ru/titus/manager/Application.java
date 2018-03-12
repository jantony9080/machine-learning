package ru.titus.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("ru.titus.storage.mysql")
@EntityScan("ru.titus.model")
@SpringBootApplication(scanBasePackages = "ru.titus")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
