package com.springBootWithoutDB.dependencyInjectionExamples.ex1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class DepInjectEx1 {
    public static void main(String[] args) {
        try(var applicationContext =
                    new AnnotationConfigApplicationContext(DepInjectEx1.class)) {
            Arrays.stream(applicationContext
                    .getBeanDefinitionNames()).forEach(System.out::println);

        }
    }
}
