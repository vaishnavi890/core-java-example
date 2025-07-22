package com.vaishnavi.practice.java21feature.advanceSwitch;

//record example java 21 features

public class RecordPatternDemo {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(5, 6);
        Point p3 = null;

        System.out.println(describePoint(p1));
        System.out.println(describePoint(p2));
        System.out.println(describePoint(p3));
    }

    private static String describePoint(Point point) {

        String description = null;
        switch (point) {
            case Point(int x, int y) when x == 0 && y == 0 -> description = "original point";
            case Point(int x, int y) -> description = "point at(" + x + " , " + y + ")";
            case null -> description = "null value";
            default -> throw new IllegalStateException("Unexpected value: " + point);
        }
        return description;
    }
}

