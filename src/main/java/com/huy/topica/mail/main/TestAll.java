package com.huy.topica.mail.main;

import java.io.IOException;
import java.util.Calendar;

import javax.mail.MessagingException;

import com.huy.topica.mail.receiver.MailCheckingIMAP;

public class TestAll {
    public static void main(String[] args) {
        String host = "imap.googlemail.com";
        String storeType = "imaps";
        String mailName = "huytopicawork@gmail.com";
        String passTest = "topica123";

        try {
            MailCheckingIMAP mailCheck = new MailCheckingIMAP();
            
            Calendar fromDate = Calendar.getInstance();
            fromDate.set(2019, 6, 20, 0, 0, 0);
            Calendar toDate = Calendar.getInstance();
            toDate.set(2019, 6, 21, 23, 59, 59);
            
//            mailCheck.setFromDate(fromDate);
//            mailCheck.setToDate(toDate);
            mailCheck.check(host, storeType, mailName, passTest);
        } catch (MessagingException e) {
            Log.info("Can not send mail");
            Log.error(e);
        } catch (IOException e) {
            Log.info("File not opened");
            Log.error(e);
        }
    }
}
