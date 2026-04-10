package ch01.programming_exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex0104 {
    /*(Print a table) Write a program that displays the following table:*/
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        double n = 1;
        System.out.println("a    a^2   a^3   a^4 ");
        for (int i = 1; i <= 4; ++i) {
            System.out.printf("%-6d%-6d%-6d%-6d", i, potencia(i,2),potencia(i,3),potencia(i,4));
            System.out.println();
        }
    }

    static int potencia(int a, double b) {
        return (int) Math.pow(a, b);
    }
}
