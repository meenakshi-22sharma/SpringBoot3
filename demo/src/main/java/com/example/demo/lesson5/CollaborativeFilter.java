package com.example.demo.lesson5;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie){
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
