package com.springBootWithoutDB.dependencyInjectionExamples.exercise.exc1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class ApplicationLauncher {
    public static void main(String[] args) {
        try(
      var context = new AnnotationConfigApplicationContext(ApplicationLauncher.class);
        ){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
