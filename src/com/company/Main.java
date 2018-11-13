package com.company;

import java.util.Scanner;
import java.util.Random;

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
        for (double i : b) {
            sum += i;
        }
        System.out.println(sum);
    }
}
