package com.tmane.business;

import com.tmane.dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class BusinessImpl implements IBusiness {

    public BusinessImpl(IDao dao){this.dao=dao;}

    private IDao dao;

    @Override
    public double calculate() {
        double temp = dao.getData();
        double result = temp * 10;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
