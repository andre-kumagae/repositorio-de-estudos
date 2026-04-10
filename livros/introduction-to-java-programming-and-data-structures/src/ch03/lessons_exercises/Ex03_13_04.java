package ch03.lessons_exercises;

import java.util.Scanner;

/**
 * Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
 * Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, respectively.
 */
public class Ex03_13_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day: ");
        int weekDay = scanner.nextInt();
        switch (weekDay) {
            default:
                System.out.println("Invalid day");
                break;
            case 0:
                System.out.printf("Sunday\n");
                break;
            case 1:
                System.out.printf("Monday\n");
                break;
            case 2:
                System.out.printf("Tuesday\n");
                break;
            case 3:
                System.out.printf("Wednesday\n");
                break;
            case 4:
                System.out.printf("Thursday\n");
                break;
            case 5:
                System.out.printf("Friday\n");
                break;
            case 6:
                System.out.printf("Saturday\n");
                break;
            case 7:
                System.out.printf("Sunday\n");
                break;
        }
    }
}
