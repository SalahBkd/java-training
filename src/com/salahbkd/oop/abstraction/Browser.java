package com.salahbkd.oop.abstraction;

public class Browser {
    public void navigate(String address) {
        String ip = findIpAddress();
        String html = sendHttpRequest(ip);
        System.out.println(html);
    }

    private String sendHttpRequest(String ip) {
        return "<html></html>";
    }

    private String findIpAddress() {
        return "121.0.0.1";
    }
}
