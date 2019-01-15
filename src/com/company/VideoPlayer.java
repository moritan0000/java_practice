package com.company;

public class VideoPlayer implements Player {
    private int id;
    private static int count = 0;

    public VideoPlayer() {
        id = ++count;
    }

    public void play() {
        System.out.println("Playing the video.");
    }

    public void stop() {
        System.out.println("Stopping the video.");
    }

    public void printInfo() {
        System.out.println("ID: " + id);
    }
}