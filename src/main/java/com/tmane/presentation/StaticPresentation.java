package com.tmane.presentation;

import com.tmane.business.BusinessImpl;
import com.tmane.extention.DaoImpl_C;

public class StaticPresentation {

    public static void main(String[] args) {
        DaoImpl_C daoImpl = new DaoImpl_C();
        BusinessImpl business = new BusinessImpl();
        business.setDao(daoImpl);

        System.out.println("Static presentation : ");
        System.out.println("Result => "+business.calculate());
    }
}
