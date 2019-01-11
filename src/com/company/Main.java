package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        final double NUM = rand.nextDouble() * 10;
        int x = rand.nextInt(10);
        switch (x) {
            case 1:
                System.out.println("x = 1");
                break;
            case 4:
                System.out.println("x = 4");
                break;
            default:
                if (NUM >= 5.0) {
                    System.out.print("Type a string:");
                    String s = stdIn.next();
                    System.out.println(s);
                    break;
                }
        }
        System.out.println((x + " * " + NUM) + " = " + NUM * x);

//        for loop with label
        Outer:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i + j >= 15) {
                    break Outer;
                } else if (i * j >= 30) {
                    break;
                } else
                    System.out.printf("%d * %d = %010.5f\n", i, j, (double) (i * j));
            }
        }
//        matrix
        int[][] a = new int[5][10];
        System.out.printf("array a[%d][%d]\n", a.length, a[0].length);
        double[] b = {1., 2., 3., 4., 5.};
        double sum = 0.;
        System.out.print("b: ");
        for (double i : b) {
            sum += i;
            System.out.printf(" %f ", i);
        }
        System.out.println();
        System.out.printf("Sum: %f, Max: %f\n", sum, max(b));
        System.out.println(max(new double[]{1., 4., 7., 10.}));

//        Car test1
        Car vitz = new Car("vitz", 1660, 1500, 3640, 40.0, new Day(2000, 10, 11));
        Car march = new Car("march", 1660, 1525, 3695, 41.0, new Day());

        vitz.putSpec();
        System.out.println();
        march.putSpec();

//        Car test2
        System.out.println("Input car information");
        System.out.print("name: ");
        String name = "Random car";//stdIn.next();
        System.out.print("width: ");
        int width = rand.nextInt(10 ^ 3);//stdIn.nextInt();
        System.out.print("height: ");
        int height = rand.nextInt(10 ^ 3);//stdIn.nextInt();
        System.out.print("length: ");
        int length = rand.nextInt(10 ^ 3);//stdIn.nextInt();
        System.out.print("gas: ");
        double fuel = rand.nextDouble() * (10 ^ 3);//stdIn.nextInt();

        Car myCar = new Car(name, width, height, length, fuel, new Day());

        while (true) {
            System.out.printf("Current location: (%f, %f), fuel: %f\n", myCar.getX(), myCar.getY(), myCar.getFuel());
            System.out.print("Move?[0(No) / 1(Yes)]: ");
            if (stdIn.nextInt() == 0) break;

            System.out.print("X distance: ");
            double dx = stdIn.nextDouble();
            System.out.print("Y distance: ");
            double dy = stdIn.nextDouble();

            if (!myCar.move(dx, dy)) {
                System.out.println("Insufficient fuel!");
            }
        }


//        Day test
        String[] wd = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        System.out.println("Input your birthday: ");
        int y = rand.nextInt(2018 - 1583) + 1583 + 1;
        int m = rand.nextInt(12) + 1;
        int d = rand.nextInt(28) + 1;

        Day birthday = new Day(y, m, d);
        Day xDay = birthday;
        System.out.printf("Random birthday: %d/%d/%d (%s)\n", birthday.getYear(), birthday.getMonth(),
                birthday.getDate(), wd[birthday.dayOfWeek()]);
        xDay.set(rand.nextInt(2018 - 1583) + 1583 + 1,
                rand.nextInt(12) + 1,
                rand.nextInt(28) + 1);
        System.out.printf("xDay: %d/%d/%d (%s)\n", xDay.getYear(), xDay.getMonth(), xDay.getDate(), wd[xDay.dayOfWeek()]);

        System.out.printf("Random birthday: %d/%d/%d (%s)\n", birthday.getYear(), birthday.getMonth(),
                birthday.getDate(), wd[birthday.dayOfWeek()]);

    }


    static double max(final double[] a) {
        double max = a[0];
        for (double i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
