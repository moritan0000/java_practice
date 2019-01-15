package com.company;

public class Pet {
    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    public String getName() {
        return name;
    }

    public String getMasterName() {
        return masterName;
    }

    public void introduce() {
        System.out.printf("Pet's name is %s.\n", name);
        System.out.printf("Master's name is %s\n", masterName);
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    @Override
    public void introduce() {
        System.out.println("I'm a robot. My name is " + getName() + ".");
        System.out.println("My master is " + getMasterName() + ".");
    }

    public void work(int sw) {
        switch (sw) {
            case 0:
                System.out.println("Cleaning...");
                break;
            case 1:
                System.out.println("Doing laundry...");
                break;
            case 2:
                System.out.println("Cooking....");
                break;
        }
    }
}

class PetTester1 {
    public static void main(String[] args) {
        Pet kurt = new Pet("Kurt", "Ai");
        kurt.introduce();
        System.out.println();

        RobotPet r2d2 = new RobotPet("R2D2", "Luke");
        r2d2.introduce();
        System.out.println();

        Pet p = r2d2;
        p.introduce();
    }
}