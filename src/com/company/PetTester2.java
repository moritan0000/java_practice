package com.company;

public class PetTester2 {
    static void intro(Pet p) {
        p.introduce();
    }

    public static void main(String[] args) {
        Pet[] a = {
                new Pet("Kurt", "Ai"),
                new RobotPet("R2D2", "Luke"),
                new Pet("Michael", "Hideo")
        };

        for (Pet p : a) {
            if (p instanceof RobotPet) {
                ((RobotPet) p).work(0);
            } else {
                intro(p);
            }
            System.out.println();
        }
    }
}
