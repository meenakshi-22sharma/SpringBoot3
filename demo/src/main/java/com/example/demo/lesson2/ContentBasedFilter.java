package com.example.demo.lesson2;

public class ContentBasedFilter implements Filter{
    public String[] getRecommendations(String Movie){

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
