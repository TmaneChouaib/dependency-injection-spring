package ma.emsi.pres;

import ma.emsi.business.IBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationPresentation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ma");
        IBusiness metier = context.getBean(IBusiness.class);

        System.out.println("#######################################################################");
        System.out.println("##################### PresentationSpringAnnotation ####################");
        System.out.println("#######################################################################");

        System.out.println("the SpringAnnotationPresentation class does dependencies injection with Spring using the @Annotation.");

        System.out.println("Result =>"+metier.calcul());
    }
}
