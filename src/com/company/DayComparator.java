package com.company;

import java.util.Scanner;

public class DayComparator {
    static boolean compDay(Day d1, Day d2) {
        return d1.getYear() == d2.getYear() &&
                d1.getMonth() == d2.getMonth() &&
                d1.getDate() == d2.getDate();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int y, m, d;
        System.out.println("Enter Day1");
        System.out.print("year: ");
        y = stdIn.nextInt();
        System.out.print("month: ");
        m = stdIn.nextInt();
        System.out.print("date: ");
        d = stdIn.nextInt();
        Day day1 = new Day(y, m, d);

        System.out.println("Enter Day2");
        System.out.print("year: ");
        y = stdIn.nextInt();
        System.out.print("month: ");
        m = stdIn.nextInt();
        System.out.print("date: ");
        d = stdIn.nextInt();
        Day day2 = new Day(y, m, d);
        if (compDay(day1, day2)) {
            System.out.println("Same day!");

        } else {
            System.out.println("Different day!");
        }
    }
}
