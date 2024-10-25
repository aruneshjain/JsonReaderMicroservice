package com.JsonReader.Indexer;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class IndexerApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndexerApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
//	@Bean
//	CommandLineRunner runner(IndexService fileService){
//		return args -> {
//			// read JSON and load json
//			ObjectMapper mapper = new ObjectMapper();
//			TypeReference<List<FileData>> typeReference = new TypeReference<List<FileData>>(){};
//			InputStream inputStream = TypeReference.class.getResourceAsStream("/static/Data.json");
//			try {
//				List<FileData> data = mapper.readValue(inputStream,typeReference);
//				fileService.save(data);
//				System.out.println("Data Saved!");
//			} catch (IOException e){
//				System.out.println("Unable to save Data: " + e.getMessage());
//			}
//		};
//	}
}
