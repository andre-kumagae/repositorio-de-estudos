package ch03.lessons_exercises;

import java.util.Scanner;

public class Ex03_14_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Age: ");
        int ages = input.nextInt();
        int ticketPrice = (ages >= 16) ? 20 : 10;
        System.out.printf("Price: %d", ticketPrice);
    }
}
