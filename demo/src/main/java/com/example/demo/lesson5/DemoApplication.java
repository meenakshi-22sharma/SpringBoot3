package com.example.demo.lesson5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Working");

		ApplicationContext appContext = SpringApplication.run(DemoApplication.class, args);

		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		System.out.println(Arrays.toString(recommender.recommendMovies("Finding Dory")));

	}

}
