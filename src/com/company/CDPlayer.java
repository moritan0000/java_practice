package com.company;

public class CDPlayer implements Player {
    public void play(){
        System.out.println("Playing the CD.");
    }
    public void stop(){
        System.out.println("Stopping the CD.");
    }
    public void cleaning(){
        System.out.println("Cleaned up the head.");
    }
}