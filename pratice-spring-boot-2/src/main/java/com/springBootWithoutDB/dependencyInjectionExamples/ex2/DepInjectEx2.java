package com.springBootWithoutDB.dependencyInjectionExamples.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.Arrays;

/*Your Business.class Dependency 1 && Dependency 2 */

@Component
class YourBusinessClass{
    //INJECTING Dependencies in YourBusiness.class

    Dependency1 dependency1;

    Dependency2 dependency2;

    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("Constructor injection ->");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }


    //    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        this.dependency1 = dependency1;
//    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        this.dependency2 = dependency2;
//    }

    @Override
    public String toString() {
        return "Using "+dependency1+ " and "+dependency2;//Should use StringBuilder. As string is not good for concat.
    }
}
@Component
class Dependency1{

}
@Component
class Dependency2{

}

@Configuration
@ComponentScan //current Package
public class DepInjectEx2 {
    public static void main(String[] args) {
        try(var applicationContext =
                    new AnnotationConfigApplicationContext(DepInjectEx2.class)) {
            Arrays.stream(applicationContext
                    .getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(applicationContext.getBean(YourBusinessClass.class));
            
        }
    }
}
