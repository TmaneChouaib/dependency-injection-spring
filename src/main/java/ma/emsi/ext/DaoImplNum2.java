package ma.emsi.ext;

import ma.emsi.dao.IDao;

public class DaoImplNum2 implements IDao {
    @Override
    public double getData() {
        System.out.println("implementation number 2 : sensor version");
        double temp=5;
        return temp ;
    }
}
