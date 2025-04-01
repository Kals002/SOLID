package com.test.isp;

public class Twitter implements SocialMediaPost
{
    @Override
    public void postMessage() {
        System.out.println("Twitter posting message");
    }

    @Override
    public void sendMessage() {
        System.out.println("Twitter sending message");
    }
}
