package com.salahbkd.designpatterns.structural.adapter;

import com.salahbkd.designpatterns.structural.adapter.Gmail.GmailClient;

public class TestEmailClient {
    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        client.addProvider(new GmailAdapter(new GmailClient()));
        client.downloadEmails();

    }
}
