package com.test.liskov;

public class WhatsApp implements SocialMedia
{
    @Override
    public void sendMessage()
    {
        System.out.println("WhatsApp sending message");
    }

    @Override
    public void postMessage()
    {
        System.out.println("WhatsApp doesn't have feature to post message");
    }
}
