package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = a + b + c;
        double p2 = p / 2;
        double s1 = p2 - a;
        double s2 = p2 - b;
        double s3 = p2 - c;
        double s4 = p2 * s1 * s2 * s3;
        double first = Math.sqrt(s4);
        return first;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}