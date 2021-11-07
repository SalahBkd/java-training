package com.salahbkd.advanced.executer;

public class TestMailService {

    public static void main(String[] args) {
        MailService service = new MailService();
        System.out.println("starting...!");
        service.sendAsyn();
        System.out.println("done...!");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
