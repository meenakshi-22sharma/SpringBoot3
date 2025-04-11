package com.example.demo.lesson4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    private Filter contentBasedFilter;

    public String[] recommendMovies (String movie) {
        //print the name of interface implementation being used
        System.out.println("Name of the filter in use: " + contentBasedFilter + "\n");
        return contentBasedFilter.getRecommendations(movie);
    }
}
