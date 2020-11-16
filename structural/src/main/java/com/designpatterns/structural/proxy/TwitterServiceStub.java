package com.designpatterns.structural.proxy;

public class TwitterServiceStub implements TwitterService {

    @Override
    public String getTimeline(String screenName) {
        return null;
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
