package com.JsonReader.Bootstrap;

import com.JsonReader.Bootstrap.Controller.DataController;
import com.JsonReader.Bootstrap.Service.DataService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class BootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApplication.class, args);
	}

//	@Bean
//	CommandLineRunner runner(DataService dataService){
//		return args -> {
//			// read JSON and load json
//			ObjectMapper mapper = new ObjectMapper();
//			TypeReference<List<Data>> typeReference = new TypeReference<List<Data>>(){};
//			InputStream inputStream = TypeReference.class.getResourceAsStream("/static/Data.json");
//			try {
//				List<Data> data = mapper.readValue(inputStream,typeReference);
//				dataService.getAllData(data);
//				System.out.println("Data Saved!");
//			} catch (IOException e){
//				System.out.println("Unable to save Data: " + e.getMessage());
//			}
//		};
//	}

}
