package ch03.programming_exercises;

import java.util.Scanner;

public class Ex03_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number1 = System.currentTimeMillis()%10;
        long number2 = System.currentTimeMillis()/10%10;
        long number3 = System.currentTimeMillis()/100%10;
        String multiplication = number1 + " * " + number2 + " * " + number3;
        long result = number1*number2*number3;
        System.out.printf("What is %s? ",multiplication);
        long answer = scanner.nextLong();
        System.out.printf("%s is %b", multiplication, (answer == result));
    }
}
