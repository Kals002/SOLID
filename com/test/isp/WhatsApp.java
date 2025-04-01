package com.test.isp;

public class WhatsApp implements SocialMediaSend
{
    @Override
    public void sendMessage() {
        System.out.println("WhatsApp sending message");
    }
}
