package com.rh.internship.hello;

import com.rh.internship.hello.services.Factory;
import com.rh.internship.hello.services.MessageService;

import javax.swing.*;

/**
 * @author Saeed Zarinfam
 */
public class MainGui {

    private static MessageService messageService = Factory.getMessageServiceDesktop();

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel(messageService.getHelloMessage()));
        frame.pack();
        frame.setVisible(true);
    }
}
