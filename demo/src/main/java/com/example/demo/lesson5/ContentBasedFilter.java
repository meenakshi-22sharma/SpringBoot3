package com.example.demo.lesson5;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String Movie){

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
