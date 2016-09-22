package com.rh.Internship;

import com.rh.Internship.services.MessageService;
import com.rh.Internship.services.MessageServiceEn;
import com.rh.Internship.services.MessageServiceFa;
import com.rh.Internship.services.MessageServiceSp;

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
