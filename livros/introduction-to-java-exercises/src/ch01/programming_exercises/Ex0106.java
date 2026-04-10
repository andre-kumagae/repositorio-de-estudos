package ch01.programming_exercises;

public class Ex0106 {
    /*(Summation of a series) Write a program that displays the result of
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10.*/
    static void main() {
        System.out.print("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = ");
        int soma=0;
        for (int i = 0; i < 11; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
