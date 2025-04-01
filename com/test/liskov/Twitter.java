package com.test.liskov;

public class Twitter implements SocialMedia
{
    @Override
    public void sendMessage() {
        System.out.println("Twitter sending message");
    }

    @Override
    public void postMessage() {
        System.out.println("Twitter posting message");
    }
}
