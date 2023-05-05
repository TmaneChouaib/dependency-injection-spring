package ma.emsi.pres;

import ma.emsi.business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXMLPresentation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        IBusiness metier = (IBusiness) context.getBean("Business");

        System.out.println("#######################################################################");
        System.out.println("######################### PresentationSpringXML #######################");
        System.out.println("#######################################################################");

        System.out.println("The SpringXMLPresentation class does dependencies injection with Spring using XML tags.");
        System.out.println("Result =>"+metier.calcul());
    }
}
