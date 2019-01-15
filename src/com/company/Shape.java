package com.company;

/**
 * comment
 */
public abstract class Shape {

    public abstract void draw();

    public abstract String toString();

    public void print() {
        System.out.println(toString());
        draw();
    }
}

class Point extends Shape {
    public Point() {
    }

    @Override
    public void draw() {
        System.out.println("*");
    }

    @Override
    public String toString() {
        return "Point";
    }
}

class Rectangle extends Shape implements Plan2D {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "Rectangle(width: " + width + ", height: " + height + ")";
    }

    public int getArea() {
        return width * height;
    }
}

class Parallelogram extends Shape implements Plan2D {
    private int width;
    private int height;

    public Parallelogram(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Parallelogram(width: " + width + ", height: " + height + ")";
    }

    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public int getArea() {
        return width * height;
    }
}


abstract class AbstLine extends Shape {
    private int length;

    public AbstLine(int length) {
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}


class HorzLine extends AbstLine {
    private int length;

    HorzLine(int length) {
        super(length);
    }

    @Override
    public void draw() {
        for (int i = 1; i <= getLength(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Horizontal line(length: " + getLength() + ")";
    }
}

class VertLine extends AbstLine {
    private int length;

    VertLine(int length) {
        super(length);
    }

    @Override
    public void draw() {
        for (int i = 1; i <= getLength(); i++) {
            System.out.println("|");
        }
    }

    @Override
    public String toString() {
        return "Vertical line(length: " + getLength() + ")";
    }
}