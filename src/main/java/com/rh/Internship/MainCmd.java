package com.rh.Internship;

import com.rh.Internship.services.Factory;
import com.rh.Internship.services.MessageService;

/**
 * @author Saeed Zarinfam
 */
public class MainCmd {

    private static MessageService messageService = Factory.getMessageService();

    public static void main(String[] args) {
        System.out.println(messageService.getHelloMessage());
    }
}
