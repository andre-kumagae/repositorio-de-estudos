package ch03.programming_exercises;

import java.util.Scanner;

public class Ex03_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();
        double discrimination = Math.pow(b, 2) - 4 * a * c;
        double r1, r2;
        if (discrimination < 0){
            System.out.println("The equation has no real roots");
        } else if (discrimination == 0){
            r1 = (- b + Math.sqrt(discrimination))/(2 * a);
            System.out.printf("The equation has one root: %.2f",r1);
        }
        else{
            r1 = (- b + Math.sqrt(discrimination))/(2 * a);
            r2 = (- b - Math.sqrt(discrimination))/(2 * a);
            System.out.printf("The equation has two roots: %.2f and %.2f",r1,r2);
        }
    }
}
