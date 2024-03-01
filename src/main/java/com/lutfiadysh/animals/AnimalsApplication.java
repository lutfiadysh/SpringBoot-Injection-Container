package com.lutfiadysh.animals;

import com.lutfiadysh.animals.services.AnimalsPrinter;
import com.lutfiadysh.animals.services.impl.AnimalsPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class AnimalsApplication implements CommandLineRunner {

	private AnimalsPrinter animalsPrinter;

	public AnimalsApplication(AnimalsPrinter animalsPrinter) {
		this.animalsPrinter = animalsPrinter;
	}


	public static void main(String[] args) {
		SpringApplication.run(AnimalsApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info(animalsPrinter.print());
	}
}
