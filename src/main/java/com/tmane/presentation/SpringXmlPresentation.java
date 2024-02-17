package com.tmane.presentation;

import com.tmane.business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlPresentation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IBusiness business = (IBusiness) context.getBean("Business");

        System.out.println("Spring Xml presentation: ");
        System.out.println("Result =>"+business.calculate());
    }
}
