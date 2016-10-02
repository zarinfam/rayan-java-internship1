package com.rh.Internship.hello.services;

/**
 * @author Saeed Zarinfam
 */
public class Factory {
    public static MessageService getMessageService() {
        return  new MessageServiceEn();
    }

    public static MessageService getMessageServiceDesktop() {
        return  new MessageServiceSp();
    }
}
