package com.tmane.presentation;

import com.tmane.business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationPresentation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com");
        IBusiness business = context.getBean(IBusiness.class);

        System.out.println("Spring Annotation presentation : ");
        System.out.println("Result => " + business.calculate());
    }
}
