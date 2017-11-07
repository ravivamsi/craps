package com.aarvy.simulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aarvy.utilities.Iterator;

@SpringBootApplication
public class CrapsApplication {

	public static void main(String[] args) {
		
		Iterator iterator = new Iterator();
		
		SpringApplication.run(CrapsApplication.class, args);
		
		iterator.crapsIterator(2000);
	}
}
