package com.example.demo.lesson2;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Working");

		RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));

		recommender = new RecommenderImplementation(new ContentBasedFilter());
		result = recommender.recommendMovies("Finding Dory");
		System.out.println(Arrays.toString(result));
	}

}
