package com.rh.Internship.employee.services;

import com.rh.Internship.services.MessageService;
import com.rh.Internship.services.MessageServiceEn;
import com.rh.Internship.services.MessageServiceSp;

/**
 * @author Saeed Zarinfam
 */
public class SalaryServiceFactory {

    private static SalaryService service = new SalaryServiceImpl();

    public enum Type{
        WITH_TAX, WITHOUT_TX
    }

    public static SalaryService get() {
        return  service;
    }

    public static void changeImplementation(Type type){
        service = type == Type.WITH_TAX ? new SalaryServiceWithTax() : new SalaryServiceImpl();
    }
}
