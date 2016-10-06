package com.rh.internship.hello;

import com.rh.internship.hello.services.Factory;
import com.rh.internship.hello.services.MessageService;

/**
 * @author Saeed Zarinfam
 */
public class MainCmd {

    private static MessageService messageService = Factory.getMessageService();

    public static void main(String[] args) {
        System.out.println(messageService.getHelloMessage());
    }
}
