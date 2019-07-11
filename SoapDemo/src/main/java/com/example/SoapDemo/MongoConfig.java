package com.example.SoapDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

@Configuration
public class MongoConfig{
//	
//	@Bean
//	@Autowired
//	public MongoDatabase getMongoClient(MongoClient mongoClient, @Value("${spring.data.mongodb.database}") String mydb ) {
//		return mongoClient.getDatabase(mydb);
//	}

}