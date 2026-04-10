package ch03.lessons_exercises;

import java.util.Scanner;

public class Ex03_14_03_c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1, j = 0;
        System.out.print("Number: ");
        int number = input.nextInt();
        if (number % 3 == 0) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
    }
}
