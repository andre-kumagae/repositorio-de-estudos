package ch01.programming_exercises;

import java.util.Scanner;

public class Ex0109 {
    public static void main(String[] args) {
        double width = 5.3,height = 8.6,area,perimeter;
        area = width*height;
        perimeter = 2 * (width*height);
        System.out.printf("A rectangle with a width of %.2f and a height of %.2f has an area of %.2f and a permiter of %.2f",width,height,area,perimeter);
    }
}
