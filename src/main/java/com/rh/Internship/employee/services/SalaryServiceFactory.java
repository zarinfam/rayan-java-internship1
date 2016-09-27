package com.rh.Internship.employee.services;

import com.rh.Internship.services.MessageService;
import com.rh.Internship.services.MessageServiceEn;
import com.rh.Internship.services.MessageServiceSp;

/**
 * @author Saeed Zarinfam
 */
public class SalaryServiceFactory {
    public static SalaryService get() {
        return  new SalaryServiceImpl();
    }
}
