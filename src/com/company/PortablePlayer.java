package com.company;

public class PortablePlayer implements Player, Skinnable {
    private int skin = BLACK;

    public PortablePlayer() {
    }

    public void play() {
        System.out.println("Start playing.");
    }

    public void stop() {
        System.out.println("Stop playing.");
    }

    public void changeSkin(int skin) {
        System.out.println("Changing the skin to " + skin + ".");
    }
}

class PortablePlayerTester{
    public static void main(String[] args){
        PortablePlayer a = new PortablePlayer();
        a.play();
        a.stop();
        a.changeSkin(Skinnable.BLACK);
    }
}
