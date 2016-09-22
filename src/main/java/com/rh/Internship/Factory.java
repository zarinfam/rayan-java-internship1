package com.rh.Internship;

import com.rh.Internship.services.MessageService;
import com.rh.Internship.services.MessageServiceEn;
import com.rh.Internship.services.MessageServiceFa;

/**
 * @author Saeed Zarinfam
 */
public class Factory {
    public static MessageService getMessageService() {
        return  new MessageServiceEn();
    }
}
