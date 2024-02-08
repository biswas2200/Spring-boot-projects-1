package com.springBootWithoutDB.dependencyInjectionExamples.exercise.exc1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {
    @Override
    public int[] reteriveData() {
        return new int[]{1,2,3,4,5};
    }
}
