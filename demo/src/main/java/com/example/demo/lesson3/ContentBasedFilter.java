package com.example.demo.lesson3;

import org.springframework.stereotype.Component;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String Movie){

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
