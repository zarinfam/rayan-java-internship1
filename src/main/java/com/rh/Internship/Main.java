package com.rh.Internship;

/**
 * @author Saeed Zarinfam
 */
public class Main {

    private static MessageManager messageManager = new MessageManager();

    public static void main(String[] args) {
        System.out.println(messageManager.getHelloMessage());
    }
}
