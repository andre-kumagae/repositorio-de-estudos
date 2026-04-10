package ch03.lessons_exercises;

import java.util.Scanner;

public class Ex03_14_03_a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Score: ");
        int score = 0, scale = 2;
        int x = input.nextInt();
        if (x > 10) {
            score = 3 * scale;
        } else {
            score = 4 * scale;
        }
        System.out.printf("Scale: %d%nScore: %d", scale, score);
    }
}
