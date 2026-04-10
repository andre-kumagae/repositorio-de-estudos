package ch03.lessons_exercises;

import java.time.Year;
import java.util.Scanner;

public class Ex03_13_05 {
    public static void main(String[] args) {
        int curentYear = Year.now().getValue();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year to find the Chinese Year: ");
        int year = input.nextInt();
        int result = year % 12;
        if (year < curentYear) {
            System.out.printf("The %d Chinese year was the Year of the ", year);
        } else {
            System.out.printf("The %d Chinese year is the Year of the ", year);
        }
        if (result == 0) System.out.println("monkey");
        else if (result == 1) System.out.println("Rooster");
        else if (result == 2) System.out.println("Dog");
        else if (result == 3) System.out.println("Pig");
        else if (result == 4) System.out.println("Rat");
        else if (result == 5) System.out.println("Ox");
        else if (result == 6) System.out.println("Tiger");
        else if (result == 7) System.out.println("Rabbit");
        else if (result == 8) System.out.println("Dragon");
        else if (result == 9) System.out.println("Snake");
        else if (result == 10) System.out.println("Horse");
        else if (result == 11) System.out.println("Sheep");

    }
}
