package com.springBootWithoutDB.dependencyInjectionExamples.exercise.exc1;

import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;
    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax() {
        return Arrays.stream(dataService.reteriveData()).max().orElse(0);
    }
}
