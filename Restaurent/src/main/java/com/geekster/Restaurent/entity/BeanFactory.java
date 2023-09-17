package com.geekster.Restaurent.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<Restaurent> restaurentList(){
        return new ArrayList<>();
    }
}
