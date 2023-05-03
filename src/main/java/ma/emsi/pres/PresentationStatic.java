package ma.emsi.pres;

import ma.emsi.ext.DaoImpl2;
import ma.emsi.metier.MetierImpl;

public class Presentation {
    /*
        Injection des dépendances par
        instanciation statique => new
    */
    public static void main(String[] args) {

        //Instanciation static
        DaoImpl2 dao= new DaoImpl2();
        MetierImpl metier=new MetierImpl(dao);
        //metier.setDao(dao);

        System.out.println("#######################################################################");
        System.out.println("############################# Présentation ############################");
        System.out.println("#######################################################################");

        System.out.println("la classe Présentation fait l'injection des dépendance d'une manière static.");
        System.out.println("Résultat => "+metier.calcul());
    }
}
