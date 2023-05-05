package ma.emsi.pres;

import ma.emsi.ext.DaoImplNum2;
import ma.emsi.business.BusinessImpl;

public class StaticPresentation {
    /*
        Injection des dépendances par
        instanciation statique => new
    */
    public static void main(String[] args) {

        //Instanciation static
        DaoImplNum2 dao= new DaoImplNum2();
        BusinessImpl metier=new BusinessImpl(dao);
        //metier.setDao(dao);

        System.out.println("#######################################################################");
        System.out.println("######################### Static Presentation #########################");
        System.out.println("#######################################################################");

        System.out.println("the StaticPresentation class does dependencies injection in a static way.");
        System.out.println("Result =>"+metier.calcul());
    }
}
