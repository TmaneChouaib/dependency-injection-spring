package ma.emsi.business;

import ma.emsi.dao.IDao;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BusinessImpl implements IBusiness {

    //Loose coupling: 'We must depend on interfaces and not on classes'.
    //Also know that in 'java' an object which is not initialized its default value is null.
    public BusinessImpl(IDao dao){
        this.dao=dao;
    }

    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*10;
        return res;
    }
    //'setDao' Will allow us to inject into the Dao variable an object of a class that implements the IDao interface.
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
