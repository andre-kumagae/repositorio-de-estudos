package ch03.lessons_exercises;

import java.util.Scanner;

public class Ex03_14_01 {
    public static void main(String[] args) {
        Scanner input = new java.util.Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();
        System.out.println((x < y && y < z) ? "sorted" : "not sorted");
    }
}
