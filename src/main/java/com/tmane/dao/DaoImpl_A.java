package com.tmane.dao;

import org.springframework.stereotype.Component;

public class DaoImpl_A implements IDao {
    @Override
    public double getData() {
        System.out.println("Implementation number 1 : first version");
        double temp=Math.random()*40;
        return temp;
    }
}
