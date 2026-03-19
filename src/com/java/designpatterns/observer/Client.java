package com.java.designpatterns.observer;

public class Client {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel();
        Observer s1 = new Subscriber("Khushboo");
        Observer s2 = new Subscriber("Sweety");

        channel.addObserver(s1);
        channel.addObserver(s2);
        channel.uploadVideo();
    }
}
