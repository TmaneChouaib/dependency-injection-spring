package ma.emsi.pres;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

public class DynamicPresentation {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, ClassCastException, NoSuchMethodException, InvocationTargetException {

/*        Scanner scanner =new Scanner(new File("config.txt"));

        //Dynamic instantiation
        //The new Instance method is crossed out, because it is a "deprecated" method
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao)cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        //Invoke the setDao method of the MetierImpl class
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);


        System.out.println("#######################################################################");
        System.out.println("######################### Dynamic Presentation ########################");
        System.out.println("#######################################################################");

        System.out.println("The DynamicPresentation class does dependency injection in a dynamic way.");
        System.out.println("Result => "+metier.calcul());*/

        System.out.println("#######################################################################");
        System.out.println("######################### Dynamic Presentation ########################");
        System.out.println("#######################################################################");

        System.out.println("The DynamicPresentation class does dependencies injection in a dynamic way.");
    }
}
