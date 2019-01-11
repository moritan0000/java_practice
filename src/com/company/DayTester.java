package com.company;

import java.util.Scanner;

public class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Enter day1");
        System.out.println("Year: ");
        int y = stdIn.nextInt();
        System.out.println("Month: ");
        int m = stdIn.nextInt();
        System.out.println("Date: ");
        int d = stdIn.nextInt();

        Day day1 = new Day(y, m, d);
        System.out.println("day1 = " + day1);

        Day day2 = new Day(day1);
        System.out.println("day2 is same as day1");
        System.out.println("day2: " + day2);

        System.out.println(day1.equalTo(day2) ? "day1 == day2" : "day1 != day2");
        System.out.println(day1.isLeap() ? "this year is leap!" : "this year is not leap!");

        Day d1 = new Day();
        Day d2 = new Day(2010);
        Day d3 = new Day(2010, 10);
        Day d4 = new Day(2010, 10, 15);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);

        Day[] a = new Day[3];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Day();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
