package com.springBootWithoutDB.praticeWithoutDB.begennings;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringJava {
    public static void main(String[] args) {
        var contexConfiguration = new AnnotationConfigApplicationContext(SpringJavaConfiguration.class);
        System.out.println(contexConfiguration.getBean("firstName"));
        System.out.println(contexConfiguration.getBean("person"));
        System.out.println(contexConfiguration.getBean("yourCustomBeanAddress2"));
        //either use name of the bean or type of the bean.
        System.out.println(contexConfiguration.getBean(Address.class));
        System.out.println(contexConfiguration.getBean("methodCall"));
        System.out.println(contexConfiguration.getBean("personASParameter"));


    }
}
