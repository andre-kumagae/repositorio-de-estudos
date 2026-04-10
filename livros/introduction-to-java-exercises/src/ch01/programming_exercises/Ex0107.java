package ch01.programming_exercises;

public class Ex0107 {
    /*(Approximate p) p can be computed using the following formula:
π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
Write a program that displays the result of 4 * π = 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13).
Use 1.0 instead of 1 in your program.*/
    static void main() {
        boolean sinal = false;
        double soma = 0;
        System.out.print("\u03C0 = 4 X ( ");
        for (int i = 1; i <= 13; i+= 2) {
            if (i == 1) {
                soma = 1;
                System.out.print("1 ");
                continue;
            }
            if (!sinal) {
                soma = subtrair(soma, i);
                sinal = true;
            } else if (sinal) {
                soma = somar(soma, i);
                sinal=false;
            }
        }
        System.out.printf(") = %.2f%n",soma*4);
    }
    static double somar(double a, double b){
        System.out.printf(" + 1/%.0f ",b);
        return a += 1/b;}
    static double subtrair(double a, double b){
        System.out.printf(" - 1/%.0f ",b);
        return a -= 1/b;}
}
