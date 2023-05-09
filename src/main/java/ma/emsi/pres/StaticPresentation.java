package ma.emsi.pres;

import ma.emsi.ext.DaoImplNum2;
import ma.emsi.business.BusinessImpl;

public class StaticPresentation {
    /*
        new => Injecting dependencies through static instantiation
    */
    public static void main(String[] args) {

        //Static instantiation
        DaoImplNum2 dao= new DaoImplNum2();
        BusinessImpl business=new BusinessImpl(dao);
        //metier.setDao(dao);

        System.out.println("#######################################################################");
        System.out.println("######################### Static Presentation #########################");
        System.out.println("#######################################################################");

        System.out.println("The StaticPresentation class does dependencies injection in a static way.");
        System.out.println("Result =>"+business.calculate());
    }
}
