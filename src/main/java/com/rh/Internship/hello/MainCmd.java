package com.rh.Internship.hello;

import com.rh.Internship.hello.services.Factory;
import com.rh.Internship.hello.services.MessageService;

/**
 * @author Saeed Zarinfam
 */
public class MainCmd {

    private static MessageService messageService = Factory.getMessageService();

    public static void main(String[] args) {
        System.out.println(messageService.getHelloMessage());
    }
}
