package com.springBootWithoutDB.praticeWithoutDB.begennings;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


//Record was introduced in JDK 16.
record Person(String name, int age, Address address){}
record Person1(String name, int age){}
record Address(String firstLine, String city){/*Custom Method.*/}

@Configuration
public class SpringJavaConfiguration {
    @Bean
    public String firstName(){
        return "Namo";
    }
    @Bean
    public int age(){
        return 21;
    }
    @Bean
    public Person1 person(){
        return new Person1("Ravi", 20);
    }
    @Bean(name = "methodCall")
    public Person1 personMethodCall(){
        return new Person1(firstName(),18);
    }
    @Bean(name = "yourCustomBeanAddress2")
    public Address address(){
        return new Address("Kothanuru","Bangalore");
    }

    @Bean
    public Person personASParameter(String firstName, int age, Address address){
        return new Person(firstName, age, address);
    }
    @Bean
    public Address address2(){
        return new Address("Kothanuru","Bangalore");
    }
    @Bean
    @Primary
    public Address address3(){
        return new Address("Udaipur","PortBlair");
    }
}
