package ch03.programming_exercises;

import java.util.Scanner;

public class Ex03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double determinant = (a * d) - (b * c);
        double determinantX = (e * d) - (b * f);
        double determinantY = (a * f) - (e * c);
        double x = determinantX / determinant;
        double y = determinantY / determinant;
        if (determinant == 0) {
            System.out.println("The equation has no solution");
        } else {
            System.out.printf("x is %.1f and y is %.1f.", x, y);
        }
    }
}
