package ch03.lessons_exercises;

import java.util.Scanner;

public class Ex03_14_03_b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Income: ");
        double tax = 0;
        double income = input.nextDouble();
        if (income > 10000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.17 + 1000;
        }
        System.out.printf("Tax: %.2f", tax);
    }
}
