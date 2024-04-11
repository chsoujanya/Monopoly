package com.example.Monopoly;

import com.example.Monopoly.Model.GamePoint;
import com.example.Monopoly.Repositories.GamePointRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.Monopoly.Repositories")
public class MonopolyApplication {



	public static void main(String[] args) {
		SpringApplication.run(MonopolyApplication.class, args);
	}

}
